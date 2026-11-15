class Solution {
    public int numOfSubarrays(int[] arr) {
        long m= 1000000007L;
        long count =0;
        long even=1;
        long odd=0;
       
        int n=arr.length;
        int prefix[]=new int[n];
         // for(int i=0;i<n;i++){
        //     int sum=0;
        //     for(int j=i;j<n;j++){
        //         sum+=arr[j];
        //         if(sum%2!=0){
        //             count++;
        //         }


        //     }
        // }

        prefix[0]=arr[0];
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        for(int i=0;i<n;i++){
            if(prefix[i]%2==0){
                count=(count+odd)%m;
                even++;
            }
            else{
                count= (count+even)%m;
                odd++;
            }
        }
        

       
        return (int) count;
        
    }
}