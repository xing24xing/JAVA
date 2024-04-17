/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

/**
 *
 * @author khushi pandey
 */

import java.util.Scanner;
class arithmeticop{
    
   
        public void function(int a,int b)
        {
            
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Any Two Number");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("1st Add:- "+(a+b));
        }
    
    public void function(int a)
    {
        System.out.println("2nd Add:- "+(a+10));
    }
    public void function()
    {
        System.out.println("3rd Add:- "+(30+40));
    }
}
public class arithmetic_op_functionn_overloading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 0,b = 0;
        arithmeticop a1=new arithmeticop();
        a1.function(a,b);
        a1.function();
        a1.function(5);
        
        
        
    }
    
}
