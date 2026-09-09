class Solution {
    public boolean searchMatrix(int[][] a, int target) {
     int row = 0 , col = a[0].length-1;
     while(row<a.length && col>=0){
        if(a[row][col] == target) return true;
     
     else if(a[row][col]>target){
        col--;
     }
     else{
        row++;
     }  
    }
    return false;
    }}