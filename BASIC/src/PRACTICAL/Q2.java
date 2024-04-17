/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PRACTICAL;

/**
 *
 * @author khushi pandey
 */
public class Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        for(int i=5;i>=1;i--)
        {
            for(int j=1;j<=5-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            for(int j=1;j<=5-i;j++)
            {
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
    
}
