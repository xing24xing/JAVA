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
public class factorial_of_number {

    public static int calfactorial(int n)
    {
        if(n==1 || n==0)
        {
            return 1;
        }
       int f1=calfactorial(n-1);
        System.out.println(n+" "+f1);
       int f2=n*f1;
       return f2;
       
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int a=6;
        int f=calfactorial(a);
        System.out.println("Factorial Of 6:- "+f);
                }
    
}
