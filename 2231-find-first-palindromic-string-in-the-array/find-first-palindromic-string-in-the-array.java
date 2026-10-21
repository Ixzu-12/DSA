import java.util.Arrays;
class Solution {
    public boolean isPalindrome(String s){
        for(int i=0;i<s.length();i++){
            int j=s.length()-i-1;
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }

        }
        return true;


       
   
   }
public String firstPalindrome(String[] words) {
    String r="";
    for(int i=0;i<words.length;i++){
        if(isPalindrome(words[i])){
            r=words[i];
            break;
        }
    }
    return r;
       
       

       

        
    }
}