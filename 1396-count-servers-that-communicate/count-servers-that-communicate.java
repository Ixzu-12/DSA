import java.util.Arrays;
class Solution {
    public int countServers(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int rowcount[]=new int[m];
        int colcount[]=new int[n];
        Arrays.fill(rowcount,0);
        Arrays.fill(colcount,0);
        for(int row=0;row<m;row++){
            for(int col=0;col<n;col++){
                if(grid[row][col]==1){
                    colcount[col]+=1;
                    rowcount[row]+=1;
                }
            }
        }
        int servers=0;
        for(int row=0;row<m;row++){
            for(int col=0;col<n;col++){
                if(grid[row][col]==1 &&(colcount[col]>1||rowcount[row]>1)){
                    servers++;
                }
            }
        }
       return servers;
       
        
    }
}