class Solution {
    public void setZeroes(int[][] arr) {
       int m=arr.length;
       int n =arr[0].length;
       int[] row=new int[m];
       int[] col= new int[n];
       Arrays.fill(row,1);
       Arrays.fill(col,1);
       for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            if(arr[i][j]==0){
                row[i]=0;
                col[j]=0;
            }
        }
       }
       for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            if(row[i]==0 || col[j]==0){
                arr[i][j]=0;

            }
        }
       }
    }
}