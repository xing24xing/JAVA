/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

import java.util.Scanner;

/**
 *
 * @author khushi pandey
 */
public class Prime_Or_Not_2 {

    public static void primes(int a,int i,int c){
    if(i==1)
    {
        return;
       
    }
    else
    {
        if(a%i==0)
        {
             System.out.println("prime");
        }
        else
        {
            primes(a,i-1,0);
            System.out.println(" not prime");
        }
    }
 
            
}
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Any Number");
        int a=sc.nextInt();
        primes(a,a/2,0);
        
    }
    
}
