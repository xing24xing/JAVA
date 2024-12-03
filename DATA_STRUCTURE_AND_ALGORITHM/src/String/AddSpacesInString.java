/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package String;

/**
 *
 * @author khushi pandey
 */
public class AddSpacesInString {

    
    public static String addSpaces(String s, int[] spaces) {
        StringBuilder result = new StringBuilder();
        int n = s.length();
        int spaceIndex = 0; // Pointer for spaces array
System.out.println(n);
        for (int i = 0; i < n; i++) {
            
            // Check if the current index matches the next space index
            if (spaceIndex < spaces.length && i == spaces[spaceIndex]) {
                result.append(" "); // Add a space
                spaceIndex++;       // Move to the next space index
            }
            result.append(s.charAt(i)); // Append the current character
        }

        return result.toString();
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(addSpaces("EnjoyYourCoffee", new int[]{5, 9})); // Output: "Enjoy Your Coffee"
        System.out.println(addSpaces("JavaProgramming", new int[]{4, 10})); // Output: "Java Program ming"
        System.out.println(addSpaces("HelloWorld", new int[]{5}));         // Output: "Hello World"
    }
}



