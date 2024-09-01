/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package imp;

import java.util.Scanner;

/**
 *
 * @author khushi pandey
 */
public class PrintEvenAndOddString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Scanner sc = new Scanner(System.in);
        int numOfStrings = sc.nextInt();
        sc.nextLine(); // Consume the newline character after the integer input

        for (int j = 0; j < numOfStrings; j++) {
            String str = sc.nextLine();
            StringBuilder evenChars = new StringBuilder();
            StringBuilder oddChars = new StringBuilder();

            for (int i = 0; i < str.length(); i++) {
                if ((i & 1) == 0) {
                    evenChars.append(str.charAt(i));
                } else {
                    oddChars.append(str.charAt(i));
                }
            }

            System.out.println(evenChars.toString() + " " + oddChars.toString());
        }
    }
    
}
