class Solution {
    public int subtractProductAndSum(int n) {
        int x=0;
         int s=0; int p =1;
        while(n>0){
           
            x = n%10;
            s += x;
            p *=x;
             n=n/10;
        }
        return p-s;
    }
}