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
public class facorial2 {

    
    public static int fact(int a)
    {
      if(a>0)    
      {
          return a*fact(a-1);
      }
      else
      {
        return 1;  
      }
       
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int a;
        System.out.println("Enter Any Number");
        a=sc.nextInt();
        int f=fact(a);
        System.out.println("Factorial:- "+f);
        
        
    }
    
}
