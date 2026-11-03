import java.util.Arrays;
class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int mid=n/2;
        int midelement=nums[mid];
        int moves=0;
        for(int i=0;i<n/2;i++){
            moves+=Math.abs(midelement-nums[i]);
            moves+=Math.abs(nums[n-i-1]-midelement);

        }
        return moves;

        
    }
}