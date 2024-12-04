/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package String;

/**
 *
 * @author khushi pandey
 */
import java.util.HashSet;
public class Make_String_a_subsequence_Using_Clycle_increments {


    public static boolean canBeSubsequence(String str1, String str2) {
        if (str2.length() > str1.length()) {
            return false; // str2 can't be a subsequence if it's longer than str1
        }

        // Check if str2 is already a subsequence of str1
        if (isSubsequence(str1, str2)) {
            return true;
        }

        // Try modifying str1 and check if str2 becomes a subsequence
        HashSet<Character> str2Chars = new HashSet<>();
        for (char c : str2.toCharArray()) {
            str2Chars.add(c);
        }

        StringBuilder modifiedStr1 = new StringBuilder();
        for (char c : str1.toCharArray()) {
            char nextChar = (char) (((c - 'a' + 1) % 26) + 'a'); // Compute next cyclic character
            if (str2Chars.contains(nextChar)) {
                modifiedStr1.append(nextChar); // Replace character if necessary
            } else {
                modifiedStr1.append(c); // Keep original character
            }
        }

        // Check if str2 is a subsequence of the modified str1
        return isSubsequence(modifiedStr1.toString(), str2);
    }

    // Helper method to check if str2 is a subsequence of str1
    private static boolean isSubsequence(String str1, String str2) {
        int j = 0; // Pointer for str2
        for (int i = 0; i < str1.length() && j < str2.length(); i++) {
            if (str1.charAt(i) == str2.charAt(j)) {
                j++;
            }
        }
        return j == str2.length(); // All characters of str2 matched in order
    }

    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "ad";
        System.out.println(canBeSubsequence(str1, str2)); // Output: true

        str1 = "zc";
        str2 = "ad";
        System.out.println(canBeSubsequence(str1, str2)); // Output: true

        str1 = "ab";
        str2 = "d";
        System.out.println(canBeSubsequence(str1, str2)); // Output: false
    }
}


