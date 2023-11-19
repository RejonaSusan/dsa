import java.util.*;

public class N_queens {

    public 

    public void helper(char[][] board, List<List<String>> allboards, int col){
        
        if(col = board.length){
            saveboards(board, allboards);
            return;
        }

        for(int row = 0; row<board.length; row++){
            if(isSafe(row, col, board)){
                board[row][col] = 'Q';
                helper(board, allboards, col+1);
                board[row][col] = '.';
            }
        }
    }

    public List<List<String>> solveQueen(int n){

        List<List<String>> allboards = new ArrayList<>();
        char [][] board = new char[n][n];
        helper(board, allboards, 0);
        return allboards;
    }
    
}
