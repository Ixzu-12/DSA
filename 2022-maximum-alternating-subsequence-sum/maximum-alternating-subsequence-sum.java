import java.util.Arrays;
class Solution {

    public long solve(int nums[], int i, boolean flag, long dp[][]) {
        if (i >=nums.length)
            return 0;
        int state = flag ? 1 : 0;
        if (dp[i][state] != -1) {
            return dp[i][state];
        }
        long skip = solve(nums, i + 1, flag,dp);
        long add = nums[i];
        if (flag == false) {
            add = -add;
        }
        long take = add + solve(nums, i + 1, !flag,dp);
          dp[i][state] = Math.max(skip, take);
          return  dp[i][state];
    }

    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        long dp[][]=new long[n][2];
        for(long rows[]:dp){
            Arrays.fill(rows,-1);
        }
        
        return  solve(nums, 0, true,dp);//start 0 se h matlab even h to true as per the question 

    }
}