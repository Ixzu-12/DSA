class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        int length=mat.length;
        for(int i=0;i<length;i++){
            sum+=mat[i][i];
            if(i!=length-1-i){
                sum+=mat[i][length-1-i];
            }

        }
        return sum;
        
    }
}