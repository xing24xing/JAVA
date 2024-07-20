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
public class fibonacci_series {

  
    public static void fibonacci(long a, long b, long n){
        if(n==0)
        {
            return;
        }
        long c=a+b;
        System.out.println(c);
        fibonacci(b,c,n-1);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        long a=0,b=1,c;
        System.out.println("Enter Any Number");
        c=sc.nextInt();
        System.out.println(a);
        System.out.print(b);
        fibonacci(a,b,c-2);
    }
    
}
