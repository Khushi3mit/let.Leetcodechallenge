class Solution {
    public int[] rearrangeArray(int[] arr) {
        int n =arr.length;
        int[] pos=new int[n/2];
        int[] neg= new int[n/2];
        int p=0 ,ne=0;
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                pos[p]=arr[i];
                p++;
            }else{
                neg[ne]=arr[i];
                ne++;
            }
        }
        for(int i=0;i<n/2;i++){
            arr[i*2] = pos[i];
            arr[i*2 + 1] = neg[i];
        }
        return arr;
    }
}