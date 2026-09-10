class Solution {
    public int[] runningSum(int[] nums) {
        int m = nums.length;
       int[] ans = new int[m];
       for(int i=0;i<m;i++){
        ans[i]=nums[i];
       }
       ans[0]=nums[0];
        for(int i=1;i<m;i++){
            ans[i] = ans[i-1]+ans[i];
        }
        return ans;
    }
}