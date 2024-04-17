/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PRACTICE;

/**
 *
 * @author khushi pandey
 */
public class Bitwise_Operator_Assignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int A=1,B=2,C=3;
        A|=4;
        
        System.out.println("Before A = "+A);
        B>>=1;
        System.out.println("Before B = "+B);
        C<<=1;
        System.out.println("Before C = "+C);
        A^=C;
        System.out.println("After A = "+A);
        System.out.println("After B = "+B);
        System.out.println("After C = "+C);
    }
    
}
