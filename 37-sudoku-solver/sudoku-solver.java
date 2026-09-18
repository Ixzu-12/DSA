class Solution {
    public boolean isSafe(char[][] board,int row,int col,int number){
        for(int i=0;i<board.length;i++){
            if(board[i][col]==(char)(number+'0')){
                return false;
            }
        }
        for(int j=0;j<board.length;j++){
            if(board[row][j]==(char)(number+'0')){
                return false;
            }
        }

        int sr=(row/3)*3;
        int sc=(col/3)*3;
        for(int i=sr;i<sr+3;i++){
            for(int j=sc;j<sc+3;j++){
                if(board[i][j]==(char)(number+'0')){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean helper(char[][] board, int row, int col) {
    if (row == board.length) {
        return true;
    }

    int nrow = row;
    int ncol = col + 1;
    if (ncol == board.length) {
        nrow = row + 1;
        ncol = 0;
    }

    if (board[row][col] != '.') {
        return helper(board, nrow, ncol);
    }

    for (int num = 1; num <= 9; num++) {
        if (isSafe(board, row, col, num)) {
            board[row][col] = (char)(num + '0');

            if (helper(board, nrow, ncol)) {
                return true;
            }

            board[row][col] = '.'; 
        }
    }

    return false;
}
   
    public void solveSudoku(char[][] board) {
        helper(board,0,0);
        
    }
}