/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package object_oriented_programming;

/**
 *
 * @author khushi pandey
 */
class sum{
   
    public void printdata(int a,int b){
        System.out.println("Sum : "+ (a+b));
    }
    sum(){
        System.out.println("Constructor Called");
    }
}
public class Default_Constructor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        sum s =new sum();
        s.printdata(3, 6);
        
    }
    
}
