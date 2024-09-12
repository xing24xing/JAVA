/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Array;

/**
 *
 * @author khushi pandey
 */
public class Allot_Books {

  public static int Allot(int[] arr, int k) {
        int min = Max(arr); // Minimum should be the maximum element in the array
        int max = sumOf(arr); // Maximum sum of all elements in the array
        int res = 0;
        
        // Binary search for the minimum feasible maximum pages
        while (min <= max) {
            int mid = (min + max) / 2;
            if (feasible(arr, k, mid)) {
                res = mid;
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        return res;
    }

    // Helper function to check if a given maximum number of pages per student is feasible
    public static boolean feasible(int[] arr, int k, int res) {
        int stu = 1, sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (sum + arr[i] > res) {
                stu++;
                sum = arr[i];
                if (stu > k) {
                    return false;
                }
            } else {
                sum += arr[i];
            }
        }
        return true;
    }

    // Helper function to calculate the maximum value in the array
    public static int Max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // Helper function to calculate the sum of all elements in the array
    public static int sumOf(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int [] arr = {10,5,20};
         int result = Allot(arr, 2);
        System.out.println("Minimum possible maximum number of pages: " + result);
    }
    
}
