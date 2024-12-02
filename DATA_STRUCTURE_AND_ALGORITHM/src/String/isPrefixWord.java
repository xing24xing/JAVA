/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package String;

/**
 *
 * @author khushi pandey
 */
public class isPrefixWord {
    public static int isPrefixOfWord(String sentence, String searchWord) {
        String[] words = sentence.split(" "); // Split sentence into words
        int n = words.length;

        for (int i = 0; i < n; i++) {
            if (words[i].startsWith(searchWord)) {
                return i + 1; // Return 1-indexed position
            }
        }

        return -1; // Return -1 if no word starts with searchWord
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(isPrefixOfWord("i love programming", "pro")); // Output: 3
        System.out.println(isPrefixOfWord("hello world", "wo"));         // Output: 2
        System.out.println(isPrefixOfWord("java is awesome", "py"));     // Output: -1
    }
}

    

