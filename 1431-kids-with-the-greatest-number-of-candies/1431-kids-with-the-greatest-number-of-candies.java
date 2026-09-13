class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        List<Boolean> result = new ArrayList<>(n);
        int max = candies[0];
        for(int i=1;i<n;i++){
            if(max<candies[i]){
                max = candies[i];
            }
        }
        for(int i =0;i<n;i++){
            if(max<=candies[i]+extraCandies){
                result.add(true);
            }else{
                result.add(false);
            }
        }
        return result;
           
      

    }
}