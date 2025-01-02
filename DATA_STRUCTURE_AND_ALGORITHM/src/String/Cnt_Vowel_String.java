/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package String;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author khushi pandey
 */
public class Cnt_Vowel_String {
public static void main(String[] args) {
        String[] words1 = {"aba", "bcb", "ece", "aa", "e"};
        int[][] queries1 = {{0, 2}, {1, 4}, {1, 1}};
        System.out.println(Arrays.toString(countVowelStrings(words1, queries1))); // Output: [2, 3, 0]

        String[] words2 = {"a", "e", "i"};
        int[][] queries2 = {{0, 2}, {0, 1}, {2, 2}};
        System.out.println(Arrays.toString(countVowelStrings(words2, queries2))); // Output: [3, 2, 1]
    }

    public static int[] countVowelStrings(String[] words, int[][] queries) {
        // Helper method to check if a string starts and ends with a vowel
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

        // Step 1: Create a prefix sum array to store counts of vowel-starting and -ending strings
        int n = words.length;
        int[] prefix = new int[n + 1]; // Extra space for ease of range sum computation

        for (int i = 0; i < n; i++) {
            char start = words[i].charAt(0);
            char end = words[i].charAt(words[i].length() - 1);
            prefix[i + 1] = prefix[i] + (vowels.contains(start) && vowels.contains(end) ? 1 : 0);
        }

        // Step 2: Answer the queries using the prefix sum array
        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int li = queries[i][0];
            int ri = queries[i][1];
            ans[i] = prefix[ri + 1] - prefix[li];
        }

        return ans;
    }
}
