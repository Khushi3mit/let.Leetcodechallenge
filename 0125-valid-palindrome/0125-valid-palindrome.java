class Solution {
    public boolean isPalindrome(String s) {
    //   int n=s.length();
    //   s =s.toLowerCase();
    //   String str="";
    //   for(int i=0;i<n;i++){
    //     char ch= s.charAt(i);
    //     if(Character.isLetterOrDigit(ch)){
    //         str = str +ch; 
    //     }
    //   }
    //   String rev="";
    //   for(int i=str.length()-1;i>=0;i--){
    //     char chr = str.charAt(i);
    //     rev = rev + chr;
    //   }
    //   return str.equals(rev);

int i=0;
int j=s.length()-1;
while(i<j){
    char a =s.charAt(i);
    char b=s.charAt(j);
    if(a>='A' && a<='Z'){
        a = (char)(a+32); 
    }
    if(b>='A' && b<='Z'){
        b=(char)(b+32);
    }
    if(!((a>='a' && a<='z') || (a>='0' && a<='9'))){
        i++;

    }
    else if(!((b>='a' && b<='z') || (b>='0' && b<='9'))){
        j--;

    }else{
    if(a!=b){
        return false;
    

    }i++;
    j--;

    }
    }
    return true;
}
    }

    