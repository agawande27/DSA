class Solution {
    
    public int fib(int n) {
    int[] dp=new int[n+1];
    Arrays.fill(dp,-1);
    return fibo(n,dp);    
    }
    public int fibo(int n,int[] arr){
        if(n<=1){
            return n;
        }
        if(arr[n]!=-1){
            return arr[n];
        }
        return arr[n]=fibo(n-1,arr)+fibo(n-2,arr);
    }
}