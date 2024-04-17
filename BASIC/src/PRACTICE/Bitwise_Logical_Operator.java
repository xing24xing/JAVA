/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PRACTICE;

/**
 *
 * @author khushi pandey
 */
public class Bitwise_Logical_Operator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a=32,b=15,c=3;
        System.out.println("A is : "+a);
        System.out.println("B is : "+b);
        System.out.println("A | B : "+(a|b));
        System.out.println("A & B : "+(a&b));
        System.out.println("A ^ B : "+(a^b));
        int d=~c & 0x0f;
        System.out.println("~ C is : "+d);
    }
    
}
