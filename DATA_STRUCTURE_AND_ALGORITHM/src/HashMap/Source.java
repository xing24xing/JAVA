/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package HashMap;

import java.util.HashMap;
import java.util.Map;

public class Source {
    public static void main(String[] args) {
        // Example input
        String input = "RedYellowBlue";
        
        // Call the function to decode the message
        String decodedMessage = color_game(input);
        
        // Print the decoded message
        System.out.println(decodedMessage);
    }

    /*
     * Complete the 'color_game' function below.
     * 
     * The function is expected to return an STRING.
     * The function accepts STRING C as parameter.
     */
    public static String color_game(String C) {
        // Create a mapping of color codes to their corresponding characters
        Map<String, Character> colorMapping = new HashMap<>();
        colorMapping.put("Red", 'a');
        colorMapping.put("Green", 'b');
        colorMapping.put("Blue", 'c');
        colorMapping.put("Yellow", 'd');
        colorMapping.put("Orange", 'e');
        colorMapping.put("Pink", 'f');

        StringBuilder decodedString = new StringBuilder();
        StringBuilder currentColor = new StringBuilder();
        
        // Iterate through each character in the input string
        for (char ch : C.toCharArray()) {
            currentColor.append(ch);
            // Check if the current string matches any color code
            String color = currentColor.toString();
            if (colorMapping.containsKey(color)) {
                // Append the corresponding character to the decoded string
                decodedString.append(colorMapping.get(color));
                // Reset the current color
                currentColor.setLength(0);
            }
        }

        return decodedString.toString();
    }
}

