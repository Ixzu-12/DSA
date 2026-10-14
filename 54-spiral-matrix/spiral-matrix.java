import java.util.List;
import java.util.ArrayList;
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        int top=0;
        int down=row-1;
        int left=0;
        int right=col-1;
        List<Integer> result = new ArrayList<>();
        int dir=0;
        while(top<=down && left<=right){
            if(dir==0){
                for(int i=left;i<=right;i++){
                    result.add(matrix[top][i]);
                    }
                     top++;
                    
                }
               
                if(dir==1){
                    for(int i=top;i<=down;i++){
                        result.add(matrix[i][right]);
                    }
                    right--;
                }

                if(dir==2){
                    for(int i=right;i>=left;i--){
                        result.add(matrix[down][i]);
                    }
                    down--;
                }
                if(dir==3){
                    for(int i=down;i>=top;i--){
                        result.add(matrix[i][left]);
                    }
                    left++;
                }
                dir++;
                if(dir==4){
                    dir=0;
                }
            }
            return result;
        








        }





        
        
    }
