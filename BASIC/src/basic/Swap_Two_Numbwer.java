/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic;

import java.util.Scanner;

/**
 *
 * @author khushi pandey
 */
public class Swap_Two_Numbwer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner (System.in);
        int a,b;
//   1st operation     
        System.out.println("Enter Two Number:-");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("By Using Third Variable");
        int c=a;
            a=b;
            b=c;
        System.out.println(a+" "+b);
//    2nd Operation
        System.out.println("Enter Two Number:-");
        a=sc.nextInt();
        b=sc.nextInt();
 
        System.out.println("Without Using Third Variable:-");
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a+" "+b);
        System.out.println("Enter Two Number:-");
        a=sc.nextInt();
        b=sc.nextInt();
// 3rd Operation
        System.out.println("Using Bitwise Operator:-");
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println(a+" "+b);
            
       
    }
    
}
