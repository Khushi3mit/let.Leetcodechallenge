class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
       int n =grid.length;
    //    int n=grid[0].length; 
    //    int maxrow = 0;
    //    int maxcol = 0;
    //    int[] row= new int[m];
    //    int[] col = new int[n];
    //    for(int i=0;i<m;i++){
    //     for(int j=0;j<n;j++){
    //         maxrow= Math.max(maxrow,row[i]);
    //         maxcol = Math.max(maxcol,col[j]);

    //     }
    //    }
    int[] rowmax = new int[n];
    int[] colmax = new int[n];
    for(int r=0;r<n;r++){
        for(int c=0;c<n;c++){
            rowmax[r] = Math.max(rowmax[r],grid[r][c]);
            colmax[c] = Math.max(colmax[c],grid[r][c]);
        }
    }
    int ans=0;
    for(int r=0;r<n;r++){
        for(int c=0;c<n;c++){

            ans += Math.min(rowmax[r],colmax[c])-grid[r][c];

        }
    }
return ans;
     }
}