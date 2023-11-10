import java.util.Scanner;

public class queensn {
    public static boolean isSafe(char boards [][] , int row , int col){
        // vertical up see
        for(int i = row-1; i>= 0; i--){
            if(boards[i][col]=='Q'){
                return false;
            }
        }
        // diagonal left up
        for(int i = row-1, j= col-1 ; i>= 0 && j>=0; i-- , j--){
        if(boards[i][j]=='Q'){
            return false;

        }
        }
        // diagonal right up
        for(int i = row-1, j = col+1; i>=0 && j<boards.length; i-- , j++ ){
            if(boards [i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }
    public static void nQueens(char boards [][], int row ){
        //base
        if(row== boards.length){
            printBoard(boards);
            return;
        }
        // cloumn loop
        
             for(int j = 0; j<boards.length ; j++){
                if(isSafe(boards, row, j)){
            boards[row][j] = 'Q';
            nQueens(boards, row+1); // function call
            boards[row][j] = '.'; // backtracking step
        }
        }
       

    }
    public static void printBoard(char boards [][]){
        System.out.println("----------chessboards---------");
        for(int i = 0; i<boards.length; i++){
            for(int j =0; j<boards.length ; j++){
                System.out.print(boards[i][j]+" ");
            }
            System.out.println();
        }
    }


    public static void main(String args []){
    int n = 4;
    char boards [][] = new char[n][n];
    // intialize
    for(int i =0; i<n ; i++){
        for(int j =0 ; j<n ; j++){
            boards [i][j]= '.';
        }
    }
    nQueens(boards, 0);
    }
}