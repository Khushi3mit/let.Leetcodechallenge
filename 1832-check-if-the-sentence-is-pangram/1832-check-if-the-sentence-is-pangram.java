class Solution {
    public boolean checkIfPangram(String sentence) {
       int n=sentence.length();
       for(char c='a';c<='z';c++){
        boolean found=false;
        for(int i=0;i<n;i++){
            if(sentence.charAt(i)==c){
                found=true;
                break;
            }
        }
        if(found==false){
            return false;
        }
       } 
      return true;
    }
}