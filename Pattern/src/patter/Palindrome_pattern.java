/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package patter;

import java.util.Scanner;

/**
 *
 * @author khushi pandey
 */
public class Palindrome_pattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter The Numbers Of Rows : ");
//        int n = sc.nextInt();
//        for(int i = 1;i <= n;i++){
//            for(int j = 1;j <= n - i ;j++)
//                System.out.print(" ");
//            
//            for(int j = 1;j <= i ;j++)
//               System.out.print((char) (j + 64));
//           for(int j = i - 1;j >= 1 ;j--)
//              System.out.print((char) (j + 64));
//            System.out.println("");
          
//        }
int r = 9;
int c = 9;
         for(int i = 1;i <= r;i++)
         {
             for(int j = 1;j <= c;j++)
             {
                 if((j == 1 && i <= r/2)||
                    (j == c/2)||(i == r/2)||
                    (i == 1 && j >= c/2)||
                    ((i == r/2 || j == c) && i >= r/2)|| 
                    (i == r && j <= c/2))
                 {
                         System.out.print("*");
                 }
                 else
                     System.out.print(" ");
                     
             }
             System.out.println("");
         }
        
    }
    
}
