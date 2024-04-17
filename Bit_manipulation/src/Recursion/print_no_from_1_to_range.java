/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

import static Recursion.print_no_reverse_given_range.num;
//import java.util.Scanner;

/**
 *
 * @author khushi pandey
 */
public class print_no_from_1_to_range {

    /**
     * @param args the command line arguments
     */
    public static  void num(int n)
    {
        
        if(n==100)
        {
            return;
        }
        System.out.println(n);
        num(n+1);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        num(1);
    
    }
    
}
