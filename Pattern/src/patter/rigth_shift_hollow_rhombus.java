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
public class rigth_shift_hollow_rhombus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i;
        for(i=1;i<=5;i++)
        {
            for(int j=1;j<=5-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=5;j++)
            {
                if(i==1 || j==1 || i==5 || j==5)
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
