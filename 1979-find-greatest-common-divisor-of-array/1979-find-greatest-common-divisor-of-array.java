class Solution {
    public int findGCD(int[] nums) {
        int n =nums.length;
       // int[] ans =new int[n];
        int maxi=Integer.MIN_VALUE;
   Arrays.sort(nums);
   for(int i=1;i<=nums[n-1];i++){
    if(nums[0]%i==0 && nums[n-1]%i==0){
    
         maxi = Math.max(maxi,i);
    }

 


   }
return maxi;
    }
}