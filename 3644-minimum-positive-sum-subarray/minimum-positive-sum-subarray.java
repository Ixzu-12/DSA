class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        // pure brute force
        int n=nums.size();
        int result=Integer.MAX_VALUE;
        // for(int i=0;i<n;i++){
        //     int sum=0;
        //     for(int j=i;j<n&&(j-i+1<=r);j++){
        //         sum+=nums.get(j);
        //         if(j-i+1>=l&&sum>0){
        //             result=Math.min(result,sum);
        //         }
                

        //     }
            
        // }
        // smart brute force
        int prefixsum[]=new int[n];
        prefixsum[0]=nums.get(0);
        for(int i=1;i<n;i++){
            prefixsum[i]=prefixsum[i-1]+nums.get(i);
        }
        for(int i=0;i<n;i++){
           
            for(int len=l;len<=r && i+len<=n;len++){
                int j=i+len-1;
                int sum=prefixsum[j]-(i> 0? prefixsum[i-1]:0);
                if(sum>0){
                    result=Math.min(result,sum);
                }
                

            }
        }

       
        return result==Integer.MAX_VALUE ? -1:result;


       
        
        
    }
}