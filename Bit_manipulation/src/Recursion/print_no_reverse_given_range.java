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
public class print_no_reverse_given_range {

    /**
     * @param args the command line arguments
     */
    public static  void num(int n)
    {
        
        if(n==0)
        {
            return;
        }
        System.out.println(n);
        num(n-1);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Any Number");
        int a=sc.nextInt();
        num(a);
    }
    
}
