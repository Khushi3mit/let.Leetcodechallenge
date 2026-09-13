class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        List<Boolean> result = new ArrayList<>(n);
        for(int i=0;i<n;i++){
            int get  = candies[i]+extraCandies;
            boolean greatest = true;
              for(int j=0;j<n;j++){
                if(candies[j]>get) {
                   greatest = false;
                }
                   
             
            }
            result.add(greatest);
        }
      
        return result;
      

    }
}