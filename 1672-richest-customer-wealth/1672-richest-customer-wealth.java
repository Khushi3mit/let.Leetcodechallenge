class Solution {
    public int maximumWealth(int[][] acc) {
        int m= acc.length; int n = acc[0].length;
     int maximum =Integer.MIN_VALUE;
     for(int i=0;i<m;i++){
        int sum=0;
        for(int j=0;j<n;j++){
        sum += acc[i][j];
        }
               maximum = Math.max(maximum,sum);
     }

        return maximum;
    }
}