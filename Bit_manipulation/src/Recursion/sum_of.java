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
public class sum_of {

    public static void printsum(int n,int s){
//        int sum=0;
        if(n==0){
            System.out.println("Sum of number:- "+s);
            return;
        }
        s+=n;
        printsum(n-1,s);
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int a;
        System.out.println("Enter Any Number");
        a=sc.nextInt();
        printsum(a,0);
    }
    
}
