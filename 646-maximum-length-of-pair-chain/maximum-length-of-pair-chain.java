import java.util.Arrays;
class Solution {
    public int solve(int i,int p,int nums[][],int dp[][]){
        int n=nums.length;
        if(i>=n) return 0;
        if(p!=-1&&dp[i][p]!=-1){
            return dp[i][p];
        }
        
         int take=0;
         if(p==-1||nums[i][0]>nums[p][1]){
            take=1+solve(i+1,i,nums,dp);
         }
         int skip=solve(i+1,p,nums,dp);
         if(p!=-1){
         dp[i][p]=Math.max(take,skip);}
         return Math.max(take,skip);
    }
    public int findLongestChain(int[][] pairs) {
        int n=pairs.length;
        Arrays.sort(pairs,(a,b)-> Integer.compare(a[0],b[0]));
        int dp[][]=new int[n][n];
        for(int []row:dp){
            Arrays.fill(row,-1);
        }
        return solve(0,-1,pairs,dp);



        
    }
}