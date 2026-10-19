import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> list=new ArrayList<>();
         Arrays.sort(nums);
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                list.add(i);
                
            }
        }
        return list;

        
    }
}