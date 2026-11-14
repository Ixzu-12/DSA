import java.util.Arrays;
class Solution {
    public int solve(int i,int p,int nums[],int dp[][]){
        int n=nums.length;
        if(i>=n){
            return 0;
        }
        if(p!=-1 && dp[i][p]!=-1){
            return dp[i][p];
        }
        int take=0;
        if(p==-1||nums[p]<nums[i]){
             take=1+solve(i+1,i,nums,dp);
        }
        int skip=solve(i+1,p,nums,dp);
        if(p!= -1){
         dp[i][p]=Math.max(take,skip);}
         return Math.max(take,skip);

    
    }
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int dp[][]=new int[n][n];
        for(int []rows: dp){
            Arrays.fill(rows,-1);
        }
        return solve(0,-1,nums,dp);

        
    }
}