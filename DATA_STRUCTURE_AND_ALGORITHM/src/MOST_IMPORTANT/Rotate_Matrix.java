/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package MOST_IMPORTANT;

/**
 *
 * @author khushi pandey
 */
public class Rotate_Matrix {
    public static void rotate(int[][] matrix){
        int n = matrix.length;
        for(int i = 0;i < n/2;i++){
            for(int j = i;j < n - i - 1;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n - j -1][i];
                matrix[n - j - 1][i] = matrix[n - i - 1][n - j - 1];
                matrix[n - i - 1][n - j - 1] = matrix[j][n - i - 1];
                matrix[j][n - i - 1] = temp;
                
                
            }
        }
    }
    public static void main(String[] args) {
       int [][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
       rotate(matrix);
       for(int[] i : matrix){
           System.out.println(java.util.Arrays.toString(i));
       }
    }
    
}
