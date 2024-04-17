/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CONTROL_STATEMENTS;

/**
 *
 * @author khushi pandey
 */
public class First_10_Even_No_And_Thier_Squre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n,count=1;
        System.out.println("First 10 Even Numbers And Their Square :\n");
        System.out.println("\nNumber\tSquare\n");
        for(n=2;n<=10;n+=2){
            
            System.out.println(n+"\t"+(n*n));
            count++;
        }
    }
    
}
