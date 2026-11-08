class Solution {
    public int countServers(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                boolean can=false;
                if(grid[i][j]==1){
                    for(int column=0;column<n;column++){
                        if(grid[i][column]==1&&column!=j){
                            can=true;
                        }
                    }
                    if(can==true){
                        count++;
                    }
                    else{
                        for(int row=0;row<m;row++){
                            if(grid[row][j]==1&&row!=i){
                                can=true;
                            }
                        }
                        if(can==true){
                            count++;
                        }
                    }
                }
            }

        }
        return count;
       
        
    }
}