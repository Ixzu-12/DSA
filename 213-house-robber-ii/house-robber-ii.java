import java.util.Arrays;
class Solution {
    // public int solve(int nums[],int i,int j,int dp[]){
       
    //     if(i>j){
    //         return 0;

    //     }
    //     if(dp[i]!=-1){
    //         return dp[i];
    //     }
    //     int steal=nums[i]+solve(nums,i+2,j,dp);
    //     int skip=solve(nums,i+1,j,dp);
    //     return dp[i]=Math.max(steal,skip);

      
        
    // }
    public int rob(int[] nums) {
        int n=nums.length;
        // if(n==1){
        //     return nums[0];
        // }
        // if(n==2){
        //     return Math.max(nums[0],nums[1]);
        // }
        int dp1[]=new int[n+1];
        int dp2[]=new int[n+1];
        // Arrays.fill(dp,-1);
        // int zeroth_house=solve(nums,0,n-2,dp);
        // Arrays.fill(dp,-1);
        // int first_house=solve(nums,1,n-1,dp);
        // return Math.max(zeroth_house,first_house);
        if(n==1){
            return nums[0];
        }
        if(n==2){
            return Math.max(nums[0],nums[1]);
        }
        // stealing the first house house matlab last house mein chori nhi kr skte
        dp1[0]=0;
        for(int i=1;i<n;i++){
            int steal=nums[i-1]+((i-2>=0)? dp1[i-2]:0);
            int skip=dp1[i-1];
            dp1[i]=Math.max(steal,skip);
        }
        // stealing the second house matlab lasta wala house mein chori kr skte h
        dp2[0]=0;
        dp2[1]=0;//skip 1st house
        for(int i=2;i<=n;i++){
            int steal=nums[i-1]+((i-2>=0)?dp2[i-2]:0);
            int skip=dp2[i-1];
            dp2[i]=Math.max(steal,skip);
        }
        return Math.max(dp1[n-1],dp2[n]);

       
     
        
    }
}