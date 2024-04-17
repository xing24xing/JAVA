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
public class summ_of_num {

    public static int sum(int n)
    {
        
        if(n>0)
        {
      return n+sum(n-1);    
        }
        else
        {
            return 0;
        }
        
  
       
           
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter Any Number");
        int n=sc.nextInt();
        int result=sum(n);
        System.out.println("Sum Of Number:- "+result);
    }
    
}
