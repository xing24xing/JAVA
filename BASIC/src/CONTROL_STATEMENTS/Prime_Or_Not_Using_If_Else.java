/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CONTROL_STATEMENTS;

import java.util.Scanner;

/**
 *
 * @author khushi pandey
 */
public class Prime_Or_Not_Using_If_Else {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i,num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Any Number");
        num=sc.nextInt();
        System.out.print("The Number "+num+" is ");
        i=2;
        while(i<num){
            if(num % i == 0)
            {
                System.out.println("Not A Prime Number");
                break;
            }
            i++;
        }
        if(i==num){
            
            System.out.println("Prime Number");
        }
    }
    
}
