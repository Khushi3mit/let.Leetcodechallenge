class Solution {
    public int[] sortedSquares(int[] nums) {
        int m=nums.length; int[] ans = new int[m];
       int left=0;
       int right=m-1;
       int pos=m-1;
   while(left <= right){
    if(Math.abs(nums[left])> Math.abs(nums[right])){
    ans[pos] = nums[left]*nums[left]; left++;
    }else{
        ans[pos] = nums[right]*nums[right]; right--;
    }
    pos--;
   }
return ans;
    }
}