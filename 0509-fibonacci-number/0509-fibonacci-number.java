class Solution {
    public int fib(int n) {
    //     int fun1=1;
    //     int fun2=0;
    //  for(int i=0;i<n;i++){
    //     return sum;
    //    int sum=fun1+fun2;
    //    fun1=fun2;
    //    sum=fun2;
      
    //  }
    if(n==0 || n==1){
        return n;
    }
    return fib(n-1)+fib(n-2);
   
    }
}