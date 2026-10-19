class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int m = nums.length;
        //int[] ans =new int[m];
       
        // for(int i=0;i<m;i++){
        //    for(int j=i+1;j<m;j++){
        //     if(nums[i]<nums[j]){
        //         ans[i]=nums[i];
        //     }
        //    }
        // }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<m;i++){
            Arrays.sort(nums);
            if(nums[i]==target){
              list.add(i);
             
            }
        }

 return list;
    }
}