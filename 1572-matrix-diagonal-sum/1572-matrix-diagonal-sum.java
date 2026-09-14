class Solution {
    public int diagonalSum(int[][] arr) {
        int m =arr.length;
        int sum=0;
        for(int i=0;i<m;i++){
          
                sum+= arr[i][i];
                sum+= arr[i][m-1-i];
            }
            if(m%2==1){
                sum-= arr[m/2][m/2];
            }
            return sum;
    }
}