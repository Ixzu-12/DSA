class Solution {
    public double mypow(double x,long n){
        if(n==0){
            return 1;
        }
        if(n<0){
         double ans=mypow(x,-n);
             return 1/ans;
            
        }
        if(n%2==0){
            return mypow(x*x,n/2);

        }
        return x*mypow(x*x,(n-1)/2);
        
      
        

    }


    public double myPow(double x, int n) {
        return mypow(x,(long)n);
     

        
    }
}