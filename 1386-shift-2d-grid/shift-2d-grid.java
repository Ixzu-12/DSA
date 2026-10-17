import java.util.List;
import java.util.ArrayList;
class Solution {
    public void rev(int arr[][],int i,int j){
        int col=arr[0].length;
        while(i<j){
            int temp=arr[i/col][i%col];
            arr[i/col][i%col]=arr[j/col][j%col];
            arr[j/col][j%col]=temp;
            i++;
            j--;
        }
    }

    private List<List<Integer>> convert(int[][] grid) {
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < grid.length; i++) {
            List<Integer> currRow = new ArrayList<>();

            for (int j = 0; j < grid[0].length; j++) {
                currRow.add(grid[i][j]);
            }

            result.add(currRow);
        }

        return result;
    }
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
       
        int row=grid.length;
        int col=grid[0].length;
        int n=row*col;
        List<List<Integer>> result = new ArrayList<>();

       
        k=k%n;
        if(k==0){
            return convert(grid);
        }
        
        rev(grid,0,n-1);
        rev(grid,0,k-1);
        rev(grid,k,n-1);
        return convert(grid);
        

        


        
    }
}