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
public class Prime_Or_Not_2 {

//    public static boolean isPrime(int a, int i) {
//        if (i == 1) {
//            return true;
//        } else {
//            if (a % i == 0) {
//                return false;
//            } else {
//                return isPrime(a, i - 1);
//            }
//        }
    public static void primes(int a, int i, boolean isPrime) {
        if (i == 1) {
            if (isPrime) {
                System.out.println(a + " is Prime");
            } else {
                System.out.println(a + " is Not Prime");
            }
        } else {
            if (a % i == 0) {
                isPrime = false;
            }
            primes(a, i - 1, isPrime);
        }
    
 
}
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Any Number:");
//        int a = sc.nextInt();
//        if (isPrime(a, a / 2)) {
//            System.out.println(a + " is Prime");
//        } else {
//            System.out.println(a + " is Not Prime");
//        }
//    }
Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number:");
        int a = sc.nextInt();
        primes(a, a / 2, true);
    }
    
}
