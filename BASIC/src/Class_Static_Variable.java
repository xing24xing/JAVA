/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author khushi pandey
// static variable created when program start and destroy when the program ends.
*/


public class Class_Static_Variable {

    /**
     * @param args the command line arguments
     */
   
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        int x;//known within main
        x=10;
        if(x==10)
        {  //start new scope
            int y=20;   //y is known only to this
            System.out.println("x and y: "+ x +" " +y);//x and y both known here.
            x=y+2;   
        }
        System.out.println("x is "+x);
    }
    
}
