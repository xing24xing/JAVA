/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstraction;

/**
 *
 * @author khushi pandey
 */
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
public class abs_1 {

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
//abstract class must be declare using abstractb keyword
//it can have abstract and non-abstract mehtods
//it cannot be instantiated
//it can have constructor and static method;
//it can have finalwhich will force the subclass not to changetj the body of the method

