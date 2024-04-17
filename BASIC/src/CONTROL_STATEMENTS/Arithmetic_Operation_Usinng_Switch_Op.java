/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CONTROL_STATEMENTS;

/**
 *
 * @author khushi pandey
 */
import java.util.Scanner;
import java.io.*;
public class Arithmetic_Operation_Usinng_Switch_Op {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Any Two Numbers");
        int no1=sc.nextInt();
        int no2=sc.nextInt();
        
        System.out.println("\t\tMenu\n");
        System.out.println("\t1.Addition --> Enter A \n");
        System.out.println("\t2.Subtraction --> Enter S \n");
        System.out.println("\t3.Multiplicationn --> Enter M \n");
        System.out.println("\t4.Division --> Enter D \n");
        
        try{
            System.out.println("Enter Your Choice :");
            char choise=(char)System.in.read();
            switch(choise){
                case 'A':
                    System.out.println("Addition Of "+no1+" and "+no2+" : "+(no1+no2));
                    break;
                case 'S':
                    System.out.println("Subtraction Of "+no1+" and "+no2+" : "+(no1-no2));
                    break;
                case 'M':
                     System.out.println("Multiplication Of "+no1+" and "+no2+" : "+(no1*no2));
                     break;
                case 'D':
                     System.out.println("Division Of "+no1+" and "+no2+" : "+(no1/no2));
                     break;
                default:System.out.println("Wrong Choise");
            }
        }
       catch(Exception e){
           System.out.println("I/O Error");
       }
    }
    
}
