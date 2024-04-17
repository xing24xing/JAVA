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
public class stack_height {

    /**
     * @param args the command line arguments
     */
    public static int calpower(int x,int n)
    {
        if(n==0)
        {
            return 1;
        }
        if(x==0)
        {
            return 0;
        }
        int xpower1=calpower(x,n-1);
        int xpown=x*xpower1;
        return xpown;
       
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Value Of x");
        int x=sc.nextInt();
        System.out.println("Enter Value Of n");
        int n=sc.nextInt();
        int ans=calpower(x,n);
        System.out.println("Stack Height:- "+ans);
        
    }
    
}
