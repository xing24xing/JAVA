/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CONTROL_STATEMENTS;

/**
 *
 * @author khushi pandey
 */
public class Fibonacci_Series {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x,y,z=0;
        System.out.println("The Fibonacci Series :\n");
        System.out.println("========================\n");
        System.out.println("0\n1");
        for(x=0,y=1;y<1000;x=z){
            
            z=y;
            y=x+y;
            System.out.println(y+" ");
        }
    }
    
}
