class Solution {
    public int findNumbers(int[] arr) {
        int m = arr.length;
       
        int j=0;
        for(int i=0;i<m;i++){
             int count=0;
            while(arr[i]>0){
                arr[i]=arr[i]/10;
                count++;
            }
            if(count%2==0) j++;
        }
        return j;
    }
}