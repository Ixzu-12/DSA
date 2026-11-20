import java.util.Arrays;
class Solution {
    public int findmethod(int i,int curr,int nums[]){
        int left=i,right=nums.length;
        
        while(left<right){
            int mid=left+(right-left)/2;
            if(nums[mid]<curr){
                left=mid+1;
            }
            else{
                
                right=mid;
            }
        }
       if(left<nums.length && nums[left]==curr){
        return left;
       }
       return -1;
    }
    public int solve(int i,int inc,int nums[],int dp[][]){
        int currentval=nums[i]+inc;
        int len=1;
        if(dp[i][inc]!=-1){
            return dp[i][inc];
        }
        // finding current val+1 matlab directly find krlo currentval se 1 zyada value
        int j=findmethod(i+1,currentval+1,nums);
        if(j!=-1){
            len=Math.max(len,1+solve(j,0,nums,dp));
        }
        // finidng current val and incrementing it by 1 matlab current val ke barabar find kro val aur usko increment krdo 1 se;
        j=findmethod(i+1,currentval,nums);
        if(j!=-1){
            len=Math.max(len,1+solve(j,1,nums,dp));
        }
        return dp[i][inc]= len;
    }
  

    public int maxSelectedElements(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int result=1;
        int dp[][]=new int[n][2];
        for(int row[]:dp){
            Arrays.fill(row,-1);
        }
        for(int i=0;i<n;i++){
            result=Math.max(result,Math.max(solve(i,0,nums,dp),solve(i,1,nums,dp)));
        }
        return result;



        

    }
}