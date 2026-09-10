class Solution {
    public int[] runningSum(int[] nums) {
        int m = nums.length;
       int[] ans = new int[m];
       
       ans[0]=nums[0];
        for(int i=1;i<m;i++){
            ans[i] = ans[i-1]+nums[i];
        }
        return ans;
    }
}