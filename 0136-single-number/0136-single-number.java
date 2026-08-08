class Solution {
    public int singleNumber(int[] nums) {
      
        int n = nums.length;
        for(int i=0;i<n;i++){
            int count=0;
          int  x =nums[i];
         for(int j=0;j<n;j++){
            if(nums[j]==x){
                count++;
            }
         }
         if(count==1)
              return x;
     }
   
             return -1;
    
}
}