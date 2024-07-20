/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//logic f(n,k) = (f(n-1,k)+k)%n
package Recursion;
import java.util.Scanner;
public class Josephes_Problem {
    public static int finalWinner( int n,int k){
        if(n == 1) return 0;
        return (finalWinner(n-1,k)+k)%n;
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n,k;
        System.out.println("Enter N's Value");
        n = sc.nextInt();
        System.out.println("Enter K's Value");
        k = sc.nextInt();
        int res = finalWinner(n,k);
        System.out.println("Result : "+ res);
    }
    
}
