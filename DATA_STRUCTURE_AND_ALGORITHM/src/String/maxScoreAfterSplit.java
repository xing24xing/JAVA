/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package String;

/**
 *
 * @author khushi pandey
 */
public class maxScoreAfterSplit {

    public static int maxScore(String s) {
        int maxScore = 0;
        int leftZeros = 0;
        int rightOnes = 0;

        // Count the total number of 1s in the string (for the right part)
        for (char c : s.toCharArray()) {
            if (c == '1') {
                rightOnes++;
            }
        }

        // Iterate through the string to evaluate splits
        for (int i = 0; i < s.length() - 1; i++) {
            char c = s.charAt(i);

            // Adjust counts based on current character
            if (c == '0') {
                leftZeros++;
            } else if (c == '1') {
                rightOnes--;
            }

            // Calculate the score for the current split
            int currentScore = leftZeros + rightOnes;
            maxScore = Math.max(maxScore, currentScore);
        }

        return maxScore;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(maxScore("011101")); // Output: 5
        System.out.println(maxScore("00111"));  // Output: 5
        System.out.println(maxScore("1111"));   // Output: 3
    }
    
}
