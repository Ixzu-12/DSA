import java.util.Arrays;
class Solution {
    public int solve(int idx,int search_cost,int max_element,int n,int m,int k,int dp[][][]){
        long b=1000000007;
        if(idx==n){
            if(search_cost==k){
                return 1;
            }
            else{

                 return 0;
        }
        }
        if (search_cost > k || search_cost + (n - idx) < k) {
              return 0;
}

        if( dp[idx][search_cost][max_element]!=-1){
            return dp[idx][search_cost][max_element];
        }
        long result=0;
        for(int i=1;i<=m;i++){
            if(i>max_element){
                result+=solve(idx+1,search_cost+1,i,n,m,k,dp);
            }
            else{
                result+=solve(idx+1,search_cost,max_element,n,m,k,dp);
            }
           
            
            
        }
         result%=b;
        
         return  dp[idx][search_cost][max_element]=(int) result;
        
    }
    public int numOfArrays(int n, int m, int k) {
        int dp[][][]=new int[n][k+1][m+1];
        for(int i=0;i<n; i++){
            for(int j=0;j<=k;j++){
                Arrays.fill(dp[i][j],-1);
               

            }
           

        }
        return solve(0,0,0,n,m,k,dp);
        
        
    }
}