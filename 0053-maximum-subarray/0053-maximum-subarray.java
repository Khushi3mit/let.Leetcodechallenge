class Solution {
    public int maxSubArray(int[] arr) {
        int n = arr.length;
    //     int maxSum=Integer.MIN_VALUE;   BRUTE APP SHOWS TLE.
    //   for(int i=0;i<n;i++){
    //        int sum=0;
    //     for(int j=i;j<n;j++){
    //   sum = sum+arr[j];
    //   maxSum = Math.max(maxSum,sum);  
    //     }
    //   } 
    //   return maxSum;
//OPTIMAL APP
int sum=0; int maxSum =Integer.MIN_VALUE;
    for(int i=0;i<n;i++){
        sum =sum+arr[i];
        maxSum= Math.max(maxSum,sum);
       if(sum<0){
        sum=0;
       }

    }    
return maxSum;
    }
}