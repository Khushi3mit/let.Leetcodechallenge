class Solution {
    public boolean containsDuplicate(int[] nums) {
       // int m = nums.length;
        Set<Integer> set = new HashSet<>();
        for(int num: nums){
            if(set.contains(num)){
                return true;
            }
            set.add(num);
        } 
        return false;
    }
}