import java.util.Arrays;
class Solution {
    // public int solve(int n,int dp[]){
    //     if(n<=1){
    //         return n;
    //     }
    //     if(dp[n]!=-1){
    //         return dp[n];
    //     }
    //     return dp[n]=solve(n-1,dp)+solve(n-2,dp);
    // }

    public int fib(int n) {
        if(n<=1){
            return n;}
    //     }
    //     int dp[]=new int [n+1];
    //     Arrays.fill(dp,-1);
       
    //    return solve(n,dp);
    int a=0,b=1;
    int c=0;
    for(int i=1;i<n;i++){
        c=a+b;
        a=b;
        b=c;
    }
    return c;
    }
}