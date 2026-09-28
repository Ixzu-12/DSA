import java.util.HashSet;
class Solution {
    public boolean valid(char[][] board,int sr,int er,int sc,int ec){
        HashSet<Character> st=new HashSet<>();
        for(int i=sr;i<er;i++){
            for(int j=sc;j<ec;j++){
                if(board[i][j]=='.') continue;
                if(st.contains(board[i][j])) return false;
                st.add(board[i][j]);
            }

        }
        return true;
    }
    public boolean isValidSudoku(char[][] board) {
        
        // valdiate row
        for(int i=0;i<9;i++){
             HashSet<Character> st=new HashSet<>();
            for(int j=0;j<9;j++){
                if(board[i][j]=='.') continue;
                if(st.contains(board[i][j])) return false;
                st.add(board[i][j]);
            }
        }
        for(int j=0;j<9;j++){
            HashSet<Character> st=new HashSet<>();
            for(int i=0;i<9;i++){
                if(board[i][j]=='.') continue;
                if(st.contains(board[i][j])) return false;
                st.add(board[i][j]);
            }

        }
        for(int sr=0;sr<9;sr+=3){
            int er=sr+3;
            for(int sc=0;sc<9;sc+=3){
                int ec=sc+3;
                if(!valid(board,sr,er,sc,ec))
                return false;
            }
        }
        return true;
 
        
    }
}