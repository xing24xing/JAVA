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
public class Stack_height_int_log {

    public static int  cal(int x,int n)
    {
        if(n==0)
        {
            return 1;
        }
        if(x==0)
        {
            return 0;
        }
        if(n%2==0)
        {
            return cal(x,n/2)*cal(x,n/2);
        }
        else
        {
            return cal(x,n/2)*cal(x,n/2)*x;
        }
      
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Value Of X");
        int x=sc.nextInt();
        System.out.println("Enter Value Of N");
        int n=sc.nextInt();
        int ans=cal(x,n);
        System.out.println("Stack Height In Log:- "+ans);
    }
    
}
