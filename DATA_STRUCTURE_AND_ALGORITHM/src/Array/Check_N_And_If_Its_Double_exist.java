/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Array;

/**
 *
 * @author khushi pandey
 */
import java.util.HashSet;
public class Check_N_And_If_Its_Double_exist {

    public static boolean checkIfExist(int[] arr) {
        HashSet<Integer> seen = new HashSet<>();

        for (int num : arr) {
            // Check if the current number's double or half exists in the set
            if (seen.contains(2 * num) || (num % 2 == 0 && seen.contains(num / 2))) {
                return true;
            }
            // Add the current number to the set
            seen.add(num);
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr1 = {10, 2, 5, 3};
        System.out.println(checkIfExist(arr1)); // Output: true

        int[] arr2 = {3, 1, 7, 11};
        System.out.println(checkIfExist(arr2)); // Output: false
    }
}

    

