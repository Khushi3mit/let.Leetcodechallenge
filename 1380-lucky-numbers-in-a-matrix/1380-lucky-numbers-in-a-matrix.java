class Solution {
    public List<Integer> luckyNumbers(int[][] arr) {
        int m=arr.length;
        int n=arr[0].length;
        int[] row =new int[m];
        int[] col =new int[n];
        Arrays.fill(row,Integer.MAX_VALUE);
        Arrays.fill(col,Integer.MIN_VALUE);
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                row[i] =Math.min(row[i],arr[i][j]);
                col[j]=Math.max(col[j],arr[i][j]);
            }
        }
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]==row[i] && arr[i][j]==col[j]){
                    ans.add(arr[i][j]);
                }
            }
        }
return ans;
    }
}