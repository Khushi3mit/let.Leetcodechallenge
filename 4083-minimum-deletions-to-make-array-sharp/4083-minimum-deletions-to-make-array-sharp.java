class Solution {
    public int minDeletions(int[] nums) {
        int m= nums.length;
        int moves=0;
        for(int i=0;i<m-1;i++){
            if(nums[i]==nums[i+1]){
                moves++;
            }

        }
        return moves;
    }
}