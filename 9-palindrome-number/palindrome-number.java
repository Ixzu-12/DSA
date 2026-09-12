class Solution {
    public boolean isPalindrome(int x) {
        int original=x;
        int ans=0;
        if(x<0){
            return false;
        }
        
        while(x!=0){
         
            int digit=x%10;
            ans=(ans*10)+digit;
            x=x/10;
        //     if (ans > (Integer.MAX_VALUE - digit) / 10) {
        //     return false;
        // }
        }
        
        
            return (ans==original);
        



        
    }
}