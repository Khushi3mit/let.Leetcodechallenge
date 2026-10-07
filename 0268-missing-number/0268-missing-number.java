class Solution {
    public int missingNumber(int[] nums) {
       int n=nums.length;
//        int expectedsum; int actualsum =0;
//        expectedsum = n*(n+1)/2;
//         for(int i=0;i<n;i++){
//   actualsum += nums[i];
//         }

//        return Math.abs(expectedsum - actualsum);

// by XOR method
// int n = nums.length;
// int ans=n;
// for(int i=0;i<n;i++){
//     ans= ans ^ i ^ nums[i];
// }
// return ans;

// for(int i=1;i<=n;i++){
//     boolean found =false;
//     for(int num: nums){
//         if(num==i)  found =true;
//     }
//     if(found==false)  return i;
// }
// return 0;
Arrays.sort(nums);
for(int i=0;i<=n-1;i++){
    if(i!=nums[i]){
        return i;
    }
}
return n;
    }
}