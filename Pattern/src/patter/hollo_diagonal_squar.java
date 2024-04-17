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
public class hollo_diagonal_squar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for(int i=1;i<=8;i++)
        {
            for(int j=1;j<=8;j++)
            {
                if(i==1 || j==1 || i==8 || j==8|| i==j || j==8-i+1 )
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
