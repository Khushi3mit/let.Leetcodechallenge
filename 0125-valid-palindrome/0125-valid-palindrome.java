class Solution {
    public boolean isPalindrome(String s) {
      int n=s.length();
      s =s.toLowerCase();
      String str="";
      for(int i=0;i<n;i++){
        char ch= s.charAt(i);
        if(Character.isLetterOrDigit(ch)){
            str = str +ch; 
        }
      }
      String rev="";
      for(int i=str.length()-1;i>=0;i--){
        char chr = str.charAt(i);
        rev = rev + chr;
      }
      return str.equals(rev);
    }
}