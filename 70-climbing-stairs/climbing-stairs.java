import java.util.Arrays;
class Solution {
    // public int solve(int n,int dp[]){
    //     if(n<0){
    //         return 0;
    //     }
    //     if(n==0){
    //         return 1;
    //     }
    //     if(dp[n]!=-1){
    //         return dp[n];
    //     }
    //     return dp[n]=solve(n-1,dp)+solve(n-2,dp);
    
    public int climbStairs(int n) {
        // brute force tle as tc=2^n
        if(n<0){
            return 0;
        }
        if(n==0){
            return 1;
        }
       
    //    int a= climbStairs(n-1)+climbStairs(n-2);
    //    return a;
    int dp[]=new int[n+1];
    Arrays.fill(dp,-1);
    //  return solve(n,dp);
    dp[0]=1;
    dp[1]=1;
    for(int i=2;i<=n;i++){
        dp[i]=dp[i-1]+dp[i-2];
    }
    return dp[n];


    }
}