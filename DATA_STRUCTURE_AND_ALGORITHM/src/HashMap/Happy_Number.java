/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package HashMap;

/**
 *
 * @author khushi pandey
 */
 import java.util.HashSet;
import java.util.Set;
public class Happy_Number {

   
    public static boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();

        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = getSumOfSquares(n);
        }

        return n == 1;
    }

    private static int getSumOfSquares(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10; // Extract the last digit
            sum += digit * digit; // Add square of the digit
            num /= 10; // Remove the last digit
        }
        return sum;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(isHappy(19)); // Output: true
        System.out.println(isHappy(2));  // Output: false
        System.out.println(isHappy(7));  // Output: true
        System.out.println(isHappy(4));  // Output: false
    }
}

    

