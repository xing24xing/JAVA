/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PRACTICAL;

/**
 *
 * @author khushi pandey
 */
import java.util.Scanner;
public class Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number");
        int num = sc.nextInt();
        for(int i = 1;i <=10 ;i++)
        {
            
            System.out.println(num+" x "+i+" = "+num*i);
        }
        
    }
    
}
