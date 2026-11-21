import java.util.Arrays;
class Solution {
    public int solve(String s1,String s2,int i , int j,int dp[][]){
        if(i>=s1.length()||j>=s2.length()){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(s1.charAt(i)==s2.charAt(j)){
            return 1+solve(s1,s2,i+1,j+1,dp);
        }
        else{
            return dp[i][j]=Math.max(solve(s1,s2,i,j+1,dp),solve(s1,s2,i+1,j,dp));
        }
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int dp[][]=new int[text1.length()][text2.length()];
        for(int row[]:dp){
            Arrays.fill(row,-1);
        }
        return solve(text1,text2,0,0,dp);
        
    }
}