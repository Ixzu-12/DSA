import java.util.Arrays;
import java.util.TreeMap;

class Solution {
    // public long solve(int nums[],int i,int p,long dp[][]){
    //     if(i>=nums.length){
    //         return 0;}
    //         if(p!=-1&&dp[i][p]!=-1){
    //             return dp[i][p];
    //         }
       
    //     long taken=Integer.MIN_VALUE;
    //     long not_taken=Integer.MIN_VALUE;
        
    //     if(p==-1||nums[i]-nums[p]>=i-p){
    //         taken=nums[i]+solve(nums,i+1,i,dp);

    //     }
    //     not_taken=solve(nums,i+1,p,dp);
    //     if(p!=-1){

    //      dp[i][p]=(long) Math.max(taken,not_taken);}
    //      return (long) Math.max(taken,not_taken);


    // }
    
    public long maxBalancedSubsequenceSum(int[] nums) {
        int max_ele=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            max_ele=Math.max(max_ele,nums[i]);
        }
        if(max_ele<=0){
            return max_ele;
        }
        // long dp[][]=new long[nums.length][nums.length];
        // for(long row[]:dp){
        //     Arrays.fill(row,-1);
        // }
        // return solve(nums,0,-1,dp);
        // 'good solution but not optimal so TLE AND MLE'
        // 'Going with the optimal approach'
         int n = nums.length;
        int [] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = nums[i]-i;
        }
        TreeMap<Integer, Long> map = new TreeMap<>();
        long ans = Integer.MIN_VALUE;
        for(int i = 0; i<n; i++){
            if(nums[i]<=0){
                ans = Math.max(ans, nums[i]);
            }
            else{
                long temp = nums[i];
                if(map.floorKey(arr[i])!=null){
                    temp += map.get(map.floorKey(arr[i]));
                }
                while(map.ceilingKey(arr[i])!=null && map.get(map.ceilingKey(arr[i]))<temp){
                    map.remove(map.ceilingKey(arr[i]));
                }
                if(map.floorKey(arr[i])==null || map.get(map.floorKey(arr[i]))<temp){
                    map.put(arr[i], temp);
                }
                ans = Math.max(ans, temp);
            }
        }
        return ans;
        
    }
}