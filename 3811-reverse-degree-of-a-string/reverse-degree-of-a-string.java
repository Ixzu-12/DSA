class Solution {
    public int reverseDegree(String s) {
        int rev=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);

            int revpos=26-(c-'a');
            int idx=i+1;
            rev+=revpos*idx;
        }
        return rev;

  
    }
}