class Solution {
    public int majorityElement(int[] nums) {
    //     int n =nums.length; int count=0;
    //     for(int i=0;i<n;i++){
    //         for(int j=0;j<n;j++){
    //             if(nums[i]==nums[j]){
    // count++;
    //             }
    //         }
    //           if(count>n/2){
    //             return nums[i];
    //         }
    //     }
    //     return -1;


    // HashMap<Integer,Integer> mpp = new HashMap<>();
    // int n = nums.length;
    // for(int i=0;i<n;i++){
    //  int key = nums[i];
    //  if(mpp.containsKey(key)){
    //     int freq = mpp.get(key);
    //     mpp.put(key,freq+1);
    //  }
    //  else{
    //     mpp.put(key,1);
    //  }
    //  if(mpp.get(key)>(n/2)){
    //     return key;
    //  }
    // }
    //      return 0;
    int  n = nums.length;
    int freq=0;
    int majority_ele=0;
    for(int i=0;i<n;i++){
        if(freq==0){
            majority_ele =nums[i];
            freq=1;
        }else{
            if(nums[i]==majority_ele){
                freq++;
            }else{
                freq--;
            }
        }
    }
      return majority_ele;
    }
}