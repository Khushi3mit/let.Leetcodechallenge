class Solution {
    public int[][] flipAndInvertImage(int[][] arr) {
        int m = arr.length; int n =arr[0].length;
        int[][] ans = new int[m][n];
        for(int i=0;i<m;i++ ){
            for(int j=0;j<n;j++){
            ans[i][j] = arr[i][n-1-j]; //reverse
            }
        }
      for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            if(ans[i][j]==1){
                ans[i][j]=0;
            }else{
                ans[i][j]=1;
            }
        }
      }
      return ans;
    }
}