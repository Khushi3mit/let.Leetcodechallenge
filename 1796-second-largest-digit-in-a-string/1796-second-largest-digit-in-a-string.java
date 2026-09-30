class Solution {
    public int secondHighest(String s) {
        int n =s.length();
        int lar=-1;
        int sec_lar=-1;
        for(int i=0;i<n;i++){
            int d =(int)(s.charAt(i)-'0');
            if(d>=0 && d<=9){
                if(d>lar){
                    sec_lar=lar;
                    lar=d; 
                }
                else if(d>sec_lar && d!=lar ){
                    sec_lar=d;             
                       }
            }
        }
    
    return sec_lar;
}
}