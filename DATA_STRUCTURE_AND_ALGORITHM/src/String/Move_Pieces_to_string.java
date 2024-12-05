/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package String;

/**
 *
 * @author khushi pandey
 */
public class Move_Pieces_to_string {


    public boolean canTransform(String start, String target) {
        // Remove '_' from both strings to check if their structure matches
        String startFiltered = start.replace("_", "");
        String targetFiltered = target.replace("_", "");
        if (!startFiltered.equals(targetFiltered)) {
            return false; // Structure doesn't match
        }
        
        int n = start.length();
        int i = 0, j = 0;
        
        while (i < n && j < n) {
            // Skip '_' in both strings
            while (i < n && start.charAt(i) == '_') i++;
            while (j < n && target.charAt(j) == '_') j++;
            
            // If one pointer reaches the end while the other doesn't
            if (i == n || j == n) {
                return i == j;
            }
            
            // If the characters at the current positions are different
            if (start.charAt(i) != target.charAt(j)) {
                return false;
            }
            
            // Movement constraints
            if (start.charAt(i) == 'L' && i < j) {
                return false; // 'L' can't move to the right
            }
            if (start.charAt(i) == 'R' && i > j) {
                return false; // 'R' can't move to the left
            }
            
            // Move to the next character
            i++;
            j++;
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        Move_Pieces_to_string ts = new Move_Pieces_to_string();
        
        // Test cases
        System.out.println(ts.canTransform("_L__R__R_", "L______RR")); // true
        System.out.println(ts.canTransform("R_L_", "__LR"));          // false
        System.out.println(ts.canTransform("_R", "R_"));              // false
    }
}

    

