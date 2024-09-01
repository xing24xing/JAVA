/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BackTracking;

/**
 *
 * @author khushi pandey
 */
public class NQueens {
    boolean isSafe(int[][] board, int row, int col) {
        int N = board.length;
        
        // Check this column on the same row
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 1) {
                return false;
            }
        }
        
        // Check upper diagonal on the left side
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }
        
        // Check upper diagonal on the right side
        for (int i = row, j = col; i >= 0 && j < N; i--, j++) {
            if (board[i][j] == 1) {
                return false;
            }
        }
        
        return true;
    }
  boolean nQueen(int board[][] ,int row){
      int N = board.length;
      if(row == N) return  true;
      for(int col = 0;col < N;col++){
          if(isSafe(board,row,col)){
              board[row][col] = 1;
              if(nQueen(board,row+1)){
                  return true;
                  
              }
              board[row][col] = 0;
          }
      }
          return false;   
  }
//  void printBoard(int[][] board) {
//        int N = board.length;
//        for (int i = 0; i < N; i++) {
//            for (int j = 0; j < N; j++) {
//                System.out.print(board[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
  // Method to print the board with grid borders
void printBoard(int[][] board) {
    int N = board.length;
    
    // Print top border
    System.out.print("");
    for (int i = 0; i < N; i++) {
        System.out.print("----");
    }
    System.out.println("-");
    
    // Print the board with borders
    for (int i = 0; i < N; i++) {
        
        System.out.print("|");
        for (int j = 0; j < N; j++) {
            System.out.print(" " + (board[i][j] == 1 ? "Q" : " ") + " |");
        }
        System.out.println();
        
        // Print horizontal separator
        System.out.print("");
        for (int j = 0; j < N; j++) {
            System.out.print("----");
        }
        System.out.println("-");
    }
}

    
    
    public static void main(String[] args) {
       int N = 4; // Size of the board
        int[][] board = new int[N][N]; // Initialize the board
        
        NQueens queens = new NQueens();
        
        if (queens.nQueen(board, 0)) {
            queens.printBoard(board); // Print the board if solution is found
        } else {
            System.out.println("No solution exists");
        }
    }
    
    
}
