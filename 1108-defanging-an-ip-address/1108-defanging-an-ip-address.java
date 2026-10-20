class Solution {
    public String defangIPaddr(String address) {
    //    int n = address.length();
    //    for(int i=0;i<n;i++){
    //     char ch = address.charAt(i);
    //     if(ch=='.'){
    //         ch = '[.]';
    //     }
    //      return address;
    //    } 

    int n =address.length();
    String ans  ="";
    for(int i=0;i<n;i++){
        char ch =address.charAt(i);
        if(ch=='.'){
            ans =ans+ "[.]";
        }else{
            ans =ans+ch;
        }
    }
      return ans;
    }
}