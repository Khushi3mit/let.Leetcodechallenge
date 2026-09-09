class Solution {
    public int matrixScore(int[][] a) {
        int m = a.length, n = a[0].length;
        for(int i=0;i<m;i++){
            if(a[i][0]==0){
                for(int j=0;j<n;j++){
                    if(a[i][j]==0) a[i][j]=1;
                    else a[i][j]=0;
                }
            }
        }
        for(int j=1;j<n;j++){
            int noOfZeroes=0 , noOfOnes=0;
            for(int i=0;i<m;i++){
                if(a[i][j]==0) noOfZeroes++;
                else noOfOnes++;
            }
            if(noOfZeroes>noOfOnes){
                for(int i=0;i<m;i++){
                    if(a[i][j]==0) a[i][j]=1;
                    else a[i][j]=0;
                }
            }
        }
        int score=0,x=1;
        for(int j=n-1;j>=0;j--){
            for(int i=0;i<m;i++){
                score += a[i][j]*x;
            }
            x*=2;
        }
        return score;
    }
}