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
public class prime_or_not {

    public static int prime(int a,int i)
    {
        if(i==1)
        {
            return 1;
        }
        else{
            if(a%i==0)
            {
                return 0;
            }
            else
            {
                prime(a,i-1);
            }
        }
        return 0;
       
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int a;
        System.out.println("Enter Any Number");
        a=sc.nextInt();
        int flag=prime(a,a/2);
        if(flag==1)
        {
            System.out.println(a+" is a prime number");   
        }
        else
        {
            System.out.println(a+" is not a prime number");
        }
    }
    
}
