/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BackkTracking;

/**
 *
 * @author khushi pandey
 */
public class nQueen {

    public static boolean nQueen(int[][] board,int r,int N){
        if(r == N) return true;
//        System.out.println("r : "+r);
        for(int c = 0;c < N;c++){
            if(isSafe(board,r,c,N)){
                board[r][c] = 1;
                if(nQueen(board,r+1,N)){
                    return true;
                }
                board[r][c] = 0;
            }
        }
        return false;
    }
    public static boolean isSafe(int[][] board,int r,int c,int N){
       for(int i = 0;i < r;i++){
           if(board[i][c] == 1) {
               return false;
           }
        }
       for(int i = r,j = c;i >= 0 && j >=0;i--,j--){
           if(board[i][j] == 1) {
               return false;
           }
       }
       for(int i = r,j = c;i >= 0 && j < N;i--,j++){
           if(board[i][j] == 1) {
               return false;
           }
       }
        return true;
    }
    public static void print(int [][] board,int N){
        for(int i = 0;i < N;i++){
            for(int j = 0;j < N;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
       int N = 4; // Change N to the desired size of the board
        int[][] board = new int[N][N];

        if (nQueen(board, 0, N)) {
            print(board, N);
        } else {
            System.out.println("No solution exists for " + N + " queens.");
        }
    }
    
}
