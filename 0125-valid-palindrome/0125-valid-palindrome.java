class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();  int n=s.length();
        String str="";
        for(int i=0;i<n;i++){
            char ch =s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                str =str+ch;
            }
 
        }
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev= rev+ str.charAt(i);
        }
return str.equals(rev);
    }
}