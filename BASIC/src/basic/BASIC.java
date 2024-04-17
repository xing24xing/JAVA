/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic;

/**
 *
 * @author khushi pandey
 */
import java.util.Scanner;
public class BASIC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.println("Enter Two No.");
        a=sc.nextInt();
        b=sc.nextInt();
        int c=a+b;
        
        System.out.println("Additionn:- "+c);
        int d=a-b;
        System.out.println("Subtraction:- "+d);
        int e=a*b;
        System.out.println("Mulltiplication:- "+ e);
        float f=a/b;
        System.out.println("Division:- "+f);
                
        // TODO code application logic here
    }
    
}
