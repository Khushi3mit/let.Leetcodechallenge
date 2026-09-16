class Solution {
    public int missingNumber(int[] nums) {
       int n=nums.length;
       int expectedsum; int actualsum =0;
       expectedsum = n*(n+1)/2;
        for(int i=0;i<n;i++){
  actualsum += nums[i];
        }

       return Math.abs(expectedsum - actualsum);
    }
}