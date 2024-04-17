/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

/**
 *
 * @author khushi pandey
 */
import java.util.Scanner;
public class priint_no_from_1_to_5 {

    /**
     */
    public static void num(int a,int n)
    {
        if(a==n)
            return;
        
        
        System.out.println();
        
        num(a+1,n);
        
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int a;
        System.out.println("Enter Any Number");
        a=sc.nextInt();
        num(1,a);
    }
    
}
