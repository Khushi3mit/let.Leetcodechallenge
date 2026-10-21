class Solution {
    public int[][] imageSmoother(int[][] img) {
        int m=img.length;
        int n=img[0].length;
        int[][] ans = new int[m][n];
        for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            int sum=0 ; int count=0;
            for(int p=i-1;p<=i+1;p++){
                for( int q=j-1;q<=j+1;q++){
                    if(p>=0 && q>=0 && p<m && q<n ){
                        sum += img[p][q];
                        count++;
               }
              
                    }
                }
                 int avg =sum/count;
                 ans[i][j]=avg;
             
            }
        }
        return ans;
    }
}