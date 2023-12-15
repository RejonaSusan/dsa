import java.util.*;

public class N_queens {

    public boolean isSafe(int row, int col, char[][] board){
        //horizontal
        for(int j =0; j<board.length; j++){
            if(board[row][j] == 'Q'){
               return false; 
            } 
        }
        //vettical 
        for (int j=0; j <  board.length; j++){
            if(board[j][col] == 'Q'){
                return false;
            }
        }
        //upper left
        int r = row;

        for(int c=col; c>=0 && r>=0; c--, r--){
            if(board[r][c] == 'Q'){
                return false;
            }
        }
        //upper right
        for(int c=col; c<board.length && r>=0; r--, c++ ){
            if(board[r][c] == 'Q'){
                return false;
            }
        }
        //lower left
        for(int c=col; r<board.length && c>=0; r++, c--){
            if(board[r][c] == 'Q'){
                return false;
            }
        }

        //lower right
        for(int c = col; r<board.length && c<board.length; r++, c++){
            if(board[r][c] == 'Q'){
                return false;
            }
        }

        return true;
    }

    public void saveboard(char[][] board, List<List<String>> allboards){
        String row = "";
        List<String> newBoard = new ArrayList<>();

        for(int i = 0; i<board.length; i++){
            row = "";
            for(int j=0; j<board[0].length; j++){
                if(board[i][j] == 'Q'){
                    row+='Q';
                }
                else{
                    row += '.';
                }
                newBoard.add(row.toString());
            }
            allboards.add(newBoard);
        }

    }

    public void helper(char[][] board,List<List<String>> allboards, int col){
        if(col == board.length){
            saveboard(board, allboards);
            return;
        }
        for (int row = 0; row<board.length; row++ ){
            if(isSafe(row, col, board)){
                board[row][col] = 'Q';
                helper(board, allboards, col+1);
                board[row][col] = '.';
            }
        }
    }

    public List<List<String>> solveQueens(int n){
        List<List<String>> allboards = new ArrayList<>();
        char[][] board = new char[3][3];

        helper(board, allboards, 0);
        return allboards;
    } 
    
    
    public static void main(String[] args) {
        int n = 4;

        N_queens nQueensSolver = new N_queens();
        nQueensSolver.solveQueens(n);
    }
}
