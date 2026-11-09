import java.util.Arrays;
class Solution {
    // public int solve(int nums[],int i,int dp[]){
    //     if(i>=nums.length) return 0;
    //     if(dp[i]!=-1){
    //         return dp[i];
    //     }
    //     int steal=nums[i]+solve(nums,i+2,dp);
    //     int skip=solve(nums,i+1,dp);
    //     return dp[i]=Math.max(steal,skip);

    // }
    public int rob(int[] nums) {
        int dp[]=new int[nums.length+1];
        Arrays.fill(dp,-1);
        // return solve(nums,0,dp);
        // bottom up approach:
        // if we steal we wont be able to steal the next house so we can nums[i-1] and dp[i-2] steal kr skte h;
        // if we skip its just dp[i-1]
        // so 
        dp[0]=0;
        dp[1]=nums[0];
        
        for(int i=2;i<=nums.length;i++){
            int steal=nums[i-1]+dp[i-2];
            int skip=dp[i-1];
            dp[i]=Math.max(steal,skip);
           

        }
        return dp[nums.length];

        
        
    }
}