import java.util.Arrays;
class Solution {
    public boolean ispredecessor(String curr,String prev){
        int n=curr.length();
        int m=prev.length();
        if(m>n|| n-m!=1){
            return false;
        }
        int i=0,j=0;
        while(i<n&&j<m){
            if(curr.charAt(i)==prev.charAt(j)){
                i++;
                j++;
            }
            else{
                i++;
            }
        }
        return j==m;

    }
    public int solve(int i,int p,String[] words,int dp[][]){
        if(i>=words.length) return 0;
        if(p!=-1&&dp[i][p]!=-1){
            return dp[i][p];
        }
        int skip=solve(i+1,p,words,dp);
        int take=0;
        if(p==-1||ispredecessor(words[i],words[p])){
            take=1+solve(i+1,i,words,dp);
        }
        if(p!=-1){
            dp[i][p]=Math.max(take,skip);
        }
        return Math.max(skip,take);
    }
    public int longestStrChain(String[] words) {
        Arrays.sort(words,(s1,s2)-> s1.length()-s2.length());
        int dp[][]=new int[words.length][words.length];
        for(int[] rows:dp){
            Arrays.fill(rows,-1);
        }
        return solve(0,-1,words,dp);

        
    }
}