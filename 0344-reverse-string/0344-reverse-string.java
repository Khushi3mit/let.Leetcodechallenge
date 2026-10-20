class Solution {
    public void reverseString(char[] s) {
    //    int n =s.length;
    //    String ans ="";
    //    for(int i=n-1;i>=0;i--){
    //     ans = ans+s[i];
    //    } 
    //    for(int i=0;i<n;i++){
    //     s[i] =ans.charAt(i);
    //    }

//OPTIMAL IN-PLACE
int i=0;
int j=s.length-1;
while(i<j){
    char temp =s[i];
    s[i]=s[j];
     s[j]=temp;
    i++;
    j--;
}
    }
}