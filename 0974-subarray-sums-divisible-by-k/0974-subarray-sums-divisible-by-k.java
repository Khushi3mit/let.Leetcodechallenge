class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int n=nums.length;
    //   int count=0;
    //     for(int i=0;i<n;i++){
    //            int sum=0;
    //         for(int j=i;j<n;j++){
    //      sum =sum+nums[j];
    //     //    if(sum<0){
    //     //     sum=0;
    //     //    }
    //        if(sum%k==0 ){
    //         count++;
    //        } } }
    //     return count;
    // int count=0;
    // for(int i=0;i<=n-1;i++){
    //     for(int j=i;j<=n-1;j++){
    //         int sum=0;
    //         for(int p=i;p<=j;p++){
    //             sum+=nums[p];

    //         }
    //         if(sum%k==0){
    //             count++;
    //         }
    //     }
    // }
    // return count;
  int[] prefix_sum =new int[n];
  int[] rem =new int[k];
  int count=0;
  rem[0]=1;
  prefix_sum[0] =nums[0];
  for(int i=1;i<=n-1;i++){
    prefix_sum[i] =nums[i]+prefix_sum[i-1];

   }
   for(int i=0;i<=n-1;i++){
    int r =prefix_sum[i]%k;
    if(r<0){
        r =r+k;
    }
    count =count+ rem[r];
    rem[r]++;
   }
   return count;
    }
}