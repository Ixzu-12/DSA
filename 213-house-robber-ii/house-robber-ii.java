import java.util.Arrays;
class Solution {
    public int solve(int nums[],int i,int j,int dp[]){
       
        if(i>j){
            return 0;

        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int steal=nums[i]+solve(nums,i+2,j,dp);
        int skip=solve(nums,i+1,j,dp);
        return dp[i]=Math.max(steal,skip);

      
        
    }
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1){
            return nums[0];
        }
        if(n==2){
            return Math.max(nums[0],nums[1]);
        }
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        int zeroth_house=solve(nums,0,n-2,dp);
        Arrays.fill(dp,-1);
        int first_house=solve(nums,1,n-1,dp);
        return Math.max(zeroth_house,first_house);
     
        
    }
}