class Solution {
    public int sortPermutation(int[] nums) {
        int n =nums.length;
    //    int maxk=0;
    //     for(int k=0;k<n;k++){
    //    boolean  possible=true;
    //   for(int i=0;i<n;i++){
    //     if(nums[i]!=i && (nums[i] & i)!=k){
    //       possible=false;
    //       break;
    //     }
    //    }
    //  if(possible==true){
    //     maxk=Math.max(maxk,k);
    //  }  int n = nums.length; 
       
    //     }
    //  return maxk;
    int k=-1;
    boolean found =false;
    for(int i=0;i<n;i++){
        if(nums[i]!=i){
            if(!found){
                k =nums[i] & i;
                found=true;
            }else{
                k = k & nums[i] & i; 
            }
        }
    }
    if(found==false){
        return 0;
    }

      return k;
    }
}