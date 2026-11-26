class Solution {
    public boolean canAliceWin(int n) {
        int take=10;
        int steps=0;
        while(n>=take){
            n-=take;
            take-=1;
            steps++;
        }
        if(steps%2!=0){
            return true;

        }
        return false;
       
        
    }
}