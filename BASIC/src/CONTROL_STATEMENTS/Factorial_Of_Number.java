/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CONTROL_STATEMENTS;

/**
 *
 * @author khushi pandey
 */
public class Factorial_Of_Number {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i,number,factorial;
        number=8;
        for(i=1,factorial=1;i<=number;i++){
            
            factorial*=i;
        }
        System.out.println("The Factorial Of "+number+" : "+factorial);
    }
    
}
