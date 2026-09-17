class Solution {
    public int distinctAverages(int[] arr) {
    //    Arrays.sort(arr);
    //    int left=0;
    //    int right=arr.length-1; int count=0;
    //    int prev=-1;
    //   while(left<right){
    //     int sum = arr[left]+arr[right];
    //     if(sum!=prev){
    //         count++;
    //         prev =sum;
    //     }
    //     left++;
    //     right--;
       
    //   }
    //    return count;
    Arrays.sort(arr);
    int n =arr.length; 
    HashSet<Integer> set  = new HashSet<>(n);
    int left=0; int right =n-1;
    while(left<right){
        int sum =arr[left]+arr[right];
        set.add(sum);
        left++; right--;
    }
    return set.size();
    }

}