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
public class Left_solid_rhombus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if( j==1 || j==i)
                {
                System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            for(int j=1;j<=2*(5-i);j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                if( j==1 || j==i)
                {
                System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            
            System.out.println("");
        }
        for(int i=5;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                if( j==1 || j==i)
                {
                System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            for(int j=1;j<=2*(5-i);j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                if( j==1 || j==i)
                {
                System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            
            System.out.println("");
        }
    }
    
}
