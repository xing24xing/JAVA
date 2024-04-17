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
public class Palindrome_Or_Not {

    public static int sum=0;
    public static int reverse(int n){
        int rem;
       
        if(n>0){
            rem=n%10;
            sum=sum*10+rem;
            reverse(n/10);
        }
        else
        {
            return sum;
        }
        return sum;
    
}
    public static int palindrome(int n)
    {
        
        if(n==reverse(n))
        {
            return 1;
        }
        return 0;
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Any Number");
        int a=sc.nextInt();
        if(palindrome(a)==1)
        {
        System.out.println("It Is Palindrome no.");
    }
        else
        {
            System.out.println("It Is Not Palindrome no.");
        }
    }
}
