class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n=word1.length();
        int m=word2.length();
        char[] ans = new char[m+n];
        int k=0;
        int i=0;
        while(i<n || i<m){
            if(i<n){
                ans[k] =word1.charAt(i);
                k++;
        }if(i<m){
            ans[k] = word2.charAt(i);
            k++;
        }
        i++;
            

        }
       return new String (ans);
       
       
    }
}