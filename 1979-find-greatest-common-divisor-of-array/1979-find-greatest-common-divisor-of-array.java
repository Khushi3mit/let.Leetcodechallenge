class Solution {
    public int findGCD(int[] nums) {
//         int n =nums.length;
//         int maxi=Integer.MIN_VALUE;
//    Arrays.sort(nums);
//    for(int i=1;i<=nums[0];i++){
//     if(nums[0]%i==0 && nums[n-1]%i==0){
    
//          maxi = Math.max(maxi,i);
//     }
//    }
// return maxi;
 
 int n = nums.length;
            Arrays.sort(nums);
            int left=nums[0];
            int right = nums[n-1];
            int grtDiv=1;
            for(int i=2;i<=left;i++){
                if(left%i==0 && right%i==0){
                 grtDiv=Math.max(grtDiv,i);
                   
                }
            }

    return grtDiv;
       }
}
   