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
interface animal{
    
    int eyes=2;
    public void walk();
}
interface herbivore{
    
}
class horse1 implements animal,herbivore{
    public void walk()
    {
        System.out.println("walk on for legs");
    }
}
public class interfaces_in_abstraction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        horse1 h1=new horse1();
        h1.walk();
        
    }
    
}
//all the fields in interfaces are public ,static,and final by default
//all methods are public and abstract by default
//a class that implements an interface must implement all the methods declare 
//in the interface.
//interface support the functionality of multipple inheritance