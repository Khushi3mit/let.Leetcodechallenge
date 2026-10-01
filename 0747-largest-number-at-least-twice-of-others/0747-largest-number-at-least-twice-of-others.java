class Solution {
    public int dominantIndex(int[] nums) {
        int n=nums.length;
        int idx=-1;
        int max=0;
        for(int i=0;i<n;i++){
            if(max<=nums[i]){
                max =nums[i];
                idx=i;
            }
        }
        for(int i=0;i<n;i++){
            if(max>=nums[i]*2){
                continue;
            }
            else if(i==idx){
                continue;
            }
            else{
                return -1;
            }
        }
return idx;
    }
}