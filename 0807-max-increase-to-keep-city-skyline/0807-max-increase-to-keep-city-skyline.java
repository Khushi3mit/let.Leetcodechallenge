class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
       int n =grid.length;
    int ans=0;
       for(int r=0;r<n;r++){
        for(int c=0;c<n;c++){
           int  rowmax=0, colmax=0;
            for(int i=0;i<n;i++){
         rowmax= Math.max(rowmax,grid[r][i]);  
            }
           for(int i=0;i<n;i++){
            colmax = Math.max(colmax,grid[i][c]);
           }
           ans +=Math.min(rowmax, colmax)-grid[r][c];
           
        }
       }
       return ans;
//     int[] rowmax = new int[n];
//     int[] colmax = new int[n];
//     for(int r=0;r<n;r++){
//         for(int c=0;c<n;c++){
//             rowmax[r] = Math.max(rowmax[r],grid[r][c]);
//             colmax[c] = Math.max(colmax[c],grid[r][c]);
//         }
//     }
//     int ans=0;
//     for(int r=0;r<n;r++){
//         for(int c=0;c<n;c++){

//             ans += Math.min(rowmax[r],colmax[c])-grid[r][c];

//         }
//     }
// return ans;
     }
}