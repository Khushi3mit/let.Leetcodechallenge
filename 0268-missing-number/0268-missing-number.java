class Solution {
    public int missingNumber(int[] nums) {
//        int n=nums.length;
//        int expectedsum; int actualsum =0;
//        expectedsum = n*(n+1)/2;
//         for(int i=0;i<n;i++){
//   actualsum += nums[i];
//         }

//        return Math.abs(expectedsum - actualsum);
// by XOR method
int n = nums.length;
int ans=n;
for(int i=0;i<n;i++){
    ans= ans ^ i ^ nums[i];
}
return ans;
    }
}