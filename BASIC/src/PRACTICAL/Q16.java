/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PRACTICAL;

abstract class Animal{
    abstract void walk();
    Animal()
    {
        System.out.println("you are creating new animal");
    }
   public void ets()
   {
       System.out.println("animal eats");
   }
}
class horse extends Animal{
    horse(){
        System.out.println("You are creating horse");
    }
    public void walk()
     {
         System.out.println("walk on for legs");  
    }
}
class hen extends Animal{
    public void walk()
    {
        System.out.println("walk on two legs");
    }
    
}
public class Q16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        System.out.println("\nFor Horse Class\n");
       horse h1=new horse();
        h1.walk();
        h1.ets();
        System.out.println("\nFor Hen Class\n");
       hen h2=new hen();
       h2.ets();
       h2.walk();
    }
    
}
