class Solution {
   // public int smallestIndex(int[] nums) {
      //  int n = nums.length;
//         int smallin=Integer.MAX_VALUE;
//         for(int i=0;i<n;i++){
//             int j=nums[i];
//              int sum=0;
//         while(j>0){
//             int dig = j%10;
//             sum =sum + dig;
//             j=j/10;
//             }
//              if(sum==i){
//            smallin = Math.min(smallin,i);
//            return smallin;
//     }  
// }
// return -1;
public int digitSum(int x){


int sum=0;
while(x!=0){
    sum += x%10;
    x /=10;
}
return sum;
    }
 public int smallestIndex(int[] nums) {
    int n =nums.length;
    for(int i=0;i<n;i++){
        if(i==digitSum(nums[i])){
            return i;
        }
    }
    return -1;

}}