import java.util.Arrays;
class Solution {
    
    public int minMoves(int[] nums) {
        int n=nums.length;
        int s=0;
        Arrays.sort(nums);

        for(int i=0;i<n;i++){
            s+=nums[i];
        }
        return s-(n*nums[0]);

        
        
    }
}