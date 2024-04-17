/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patter;

/**
 *
 * @author khushi pandey
 */
public class rigth_shifted_inverted_triangle {

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
            System.out.println("");
        }
    }
    
}
