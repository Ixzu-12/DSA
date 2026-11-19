import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
class Solution {
    // public int solve(int i,int p,int nums[],int dp[][]){
    //     int n=nums.length;
    //     if(i>=n){
    //         return 0;
    //     }
    //     if(p!=-1 && dp[i][p]!=-1){
    //         return dp[i][p];
    //     }
    //     int take=0;
    //     if(p==-1||nums[p]<nums[i]){
    //          take=1+solve(i+1,i,nums,dp);
    //     }
    //     int skip=solve(i+1,p,nums,dp);
    //     if(p!= -1){
    //      dp[i][p]=Math.max(take,skip);}
    //      return Math.max(take,skip);
    
    // }
    public int binarySearch(List<Integer> sorted,int target){
        int left=0,right=sorted.size();
        int result=sorted.size();
        while(left<right){
            int mid=left+(right-left)/2;
            if(sorted.get(mid)<target){
                left=mid+1;
            }
            else{
                result=mid;
                right=mid;
            }

        }
        return result;
    }
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        // int dp[][]=new int[n][n];
        // for(int []rows: dp){
        //     Arrays.fill(rows,-1);
        // }
        // return solve(0,-1,nums,dp);
        // int dp[]=new int[n];
        // Arrays.fill(dp,1);
        // int maxLis=1;
        // for(int i=1;i<n;i++){
        //     for(int j=0;j<i;j++){
        //         if(nums[j]<nums[i]){
        //             dp[i]=Math.max(dp[i],dp[j]+1);
        //             maxLis=Math.max(maxLis,dp[i]);
        //         }

        //     }
        // }
        // return maxLis;
        List<Integer> sorted=new ArrayList<>();
        for(int i=0;i<n;i++){
            int index=binarySearch(sorted,nums[i]);
            if(index==sorted.size()){
                sorted.add(nums[i]);
            }
            else{
                sorted.set(index,nums[i]);
            }
        }
        return sorted.size();


        
    }
}