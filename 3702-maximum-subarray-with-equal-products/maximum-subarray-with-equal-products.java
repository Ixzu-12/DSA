class Solution {
    public int gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public int lcm(int a,int b){
        return (a/gcd(a,b))*b;
    }
    public int maxLength(int[] nums) {
        int n=nums.length;
      
        
        int maxL=0;
        
        for(int i=0;i<n;i++){
            int prod=1;
            int lcma=1;
            int grcd=0;

            for(int j=i;j<n;j++){
                prod*=nums[j];
                
             
               
                
                lcma=lcm(lcma,nums[j]);
                grcd=gcd(grcd,nums[j]);
                if(prod==(lcma*grcd)){
                    maxL=Math.max(maxL,j-i+1);
                    
                }
            }
        }
        return  maxL;
       
        
    }
}