/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tree;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author khushi pandey
 */
public class Minimum_Diameter_Two_Merging_Tree {
 public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int bottom = matrix.length - 1;
        int right = matrix[0].length - 1;
        int top = 0;
        int left = 0;
        if (matrix == null || matrix.length == 0) {
            return res;
        }
        while (top <= bottom && left <= right) {
            // left to right
            for (int i = left; i <= right; i++) {
                res.add(matrix[top][i]);
            }
            top++;
            // top to bottom
            for (int i = top; i <= bottom; i++) {
                res.add(matrix[i][right]);
            }
            right--;
            // right to left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    res.add(matrix[bottom][i]);
                }
                bottom--;
            }
            // bottom to top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    res.add(matrix[i][left]);
                }
                left++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
       Minimum_Diameter_Two_Merging_Tree solution = new Minimum_Diameter_Two_Merging_Tree();

        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] matrix2 = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };

        System.out.println("Spiral Order of matrix1: " + solution.spiralOrder(matrix1));
        System.out.println("Spiral Order of matrix2: " + solution.spiralOrder(matrix2));
    }
    
}
