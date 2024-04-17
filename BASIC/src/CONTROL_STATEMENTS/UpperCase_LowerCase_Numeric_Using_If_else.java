/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CONTROL_STATEMENTS;

/**
 *
 * @author khushi pandey
 */
public class UpperCase_LowerCase_Numeric_Using_If_else {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char c;
        try{
            System.out.println("Enter Any Character : ");
            c=(char)System.in.read();
            if((c >= 'a') && (c <= 'z'))
            {
                System.out.println("The Character Is In Lower Case. \n");
            }
            else if((c >= 'A') && (c <= 'Z'))
            {
                System.out.println("The Character Is In Upper Case. \n");
            }
            else if((c >= '0') && (c <= '9'))
            {
                
                System.out.println("The Character Is A Numeric. \n");
            }
            else{
                System.out.println("The Character Is A Symbol. \n");
            }
            
        }
        catch(Exception e){
            System.out.println("I/O Error");
        }
    }
    
}
