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
public class tower_of_hanoi {

   //time complexity o(2^n-1)
    public static void tower(int n, String src, String helper, String dest)
    {
        if(n==1)
        {
            System.out.println("Transfer Disk "+ n+" From "+src+" to "+ dest);
            return;
        }
        tower(n-1,src,dest,helper);
        System.out.println("Transfer Disk "+ n+" From "+src+" to "+ dest);
        tower(n-1,helper,src,dest);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Any Number");
        int n=sc.nextInt();
        tower(n,"s","h","d");        
    }

     

    
}
