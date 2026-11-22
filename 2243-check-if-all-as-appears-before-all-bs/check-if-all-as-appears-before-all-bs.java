import java.util.Arrays;
class Solution {
    public boolean checkString(String s) {
        int n=s.length();
        // for(int i=1;i<n;i++){
        //     if(s.charAt(i)=='a'&&s.charAt(i-1)=='b'){
        //         return false;
        //     }
        // }
        // return true;
        int last_a=-1;
        int first_b=-1;
        for(int i=0;i<n;i++){
           
            if(s.charAt(i)=='a'){
                last_a=i;   
                }
                else if(first_b==-1){
                    first_b=i;
                }
                


        }
        if(last_a==-1||first_b==-1){
            return true;
        }
        return last_a<first_b;
        
        
        

        

    }
}