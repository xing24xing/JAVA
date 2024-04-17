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
public class factorial_of_no {

    public static void fact(int n,int f)
    {
        if(n==0)
        {
            System.out.println("Factorial:- "+f);
            return;
        }
        f*=n;
        fact(n-1,f);
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int a;
        System.out.println("Enter Any Number");
        a=sc.nextInt();
        fact(a,1);
    }
    
}
