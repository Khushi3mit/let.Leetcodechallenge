class Solution {
    public int[] sortedSquares(int[] nums) {
        int m=nums.length;
        int[] ans = new int[m];
        Arrays.sort(nums);
        for(int i=0;i<m;i++){
           ans[i]  = Math.abs(nums[i]*nums[i]);
        }
        Arrays.sort(ans);
        return ans;
    }
}