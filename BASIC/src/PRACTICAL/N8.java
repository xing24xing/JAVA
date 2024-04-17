/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PRACTICAL;
class MyException extends Exception {
    public MyException(String s)
    { // Call constructor of parent Exception
        super(s);}}
 
public class N8 {
         public static void main(String[] args) {
        // TODO code application logic here
        try {
            // Throw an object of user defined exception
            throw new MyException("Error"); }
        catch (MyException ex) {
            System.out.println("Caught");
            // Print the message from MyException object
            System.out.println(ex.getMessage());  }}}
   