class Solution {
    public int findGCD(int[] nums) {
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
//    int left=Math.min(left,nums);
//     int right=Math.max(right,nums); i

    }
}