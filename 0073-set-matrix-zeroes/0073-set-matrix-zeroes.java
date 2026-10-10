class Solution {
    public void setZeroes(int[][] arr) {
       int m=arr.length;
       int n =arr[0].length;
    //    int[] row=new int[m];
    //    int[] col= new int[n];
    //    Arrays.fill(row,1);
    //    Arrays.fill(col,1);
    //    for(int i=0;i<m;i++){
    //     for(int j=0;j<n;j++){
    //         if(arr[i][j]==0){
    //             row[i]=0;
    //             col[j]=0;
    //         }
    //     }
    //    }
    //    for(int i=0;i<m;i++){
    //     for(int j=0;j<n;j++){
    //         if(row[i]==0 || col[j]==0){
    //             arr[i][j]=0;

    //         }
    //     }
    //    }

    boolean firstrow=false;
    boolean firstcol=false;
    for(int j=0;j<n;j++){
        if(arr[0][j] ==0){
            firstrow=true;

        }
    }
    for(int i=0;i<m;i++){
        if(arr[i][0]==0){
            firstcol=true;
        }
    }
    for(int i=1;i<m;i++){
        for(int j=1;j<n;j++){
            if(arr[i][j]==0){
                arr[i][0]=0;
                arr[0][j]=0;
            }
        }
    }
    for(int i=m-1;i>=1;i--){
        for(int j=n-1;j>=1;j--){
            if(arr[i][0]==0 || arr[0][j]==0){
                arr[i][j]=0;
            }
        }
    }
    if(firstrow){
        for(int j=0;j<n;j++){
            arr[0][j]=0;
        }
    }
    if(firstcol){
        for(int i=0;i<m;i++){
            arr[i][0]=0;
        }
    }
    }
}