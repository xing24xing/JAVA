/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Recursion;
import java.util.Scanner;
/**
 *
 * @author khushi pandey
 */
public class Matrix_N_And_M {

    public static int path(int m,int n){
        if(n == 1 || m == 1) return 1;
        return  path(m-1,n)+path(m,n-1);
        
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m,n;
        System.out.println("Enter Row Of Matrix");
        m = sc.nextInt();
        System.out.println("Enter Column Of Matrix");
        n = sc.nextInt();
        int res =path(m,n);
        System.out.println("Total Path : "+res);
        
        
    }
    
}
