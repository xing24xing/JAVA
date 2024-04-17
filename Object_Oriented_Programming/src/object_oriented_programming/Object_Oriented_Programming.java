/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object_oriented_programming;

/**
 *
 * @author khushi pandey
 */
class Pen{
    String color;
    String type;
    public void write()
    {
        System.out.println("Writing Something");
    }
    public void printcolor()
    {
        System.out.println(this.color);
    }
} 
class Student{
    String name;
    int age;
    
    public void printname()
    {
        System.out.println(this.name);
        System.out.println(this.age);
    }
 
}
   
       
public class Object_Oriented_Programming {
    public static void main(String[] args) {
        // TODO code application logic here
        Pen pen1=new Pen();
        pen1.color="blue";
        pen1.type="gel";
        pen1.write();
        Pen pen2=new Pen();
        pen2.color="black";
        pen2.type="ballpoint";
        pen1.printcolor();
        pen2.printcolor();
        
        Student std1=new Student();
        std1.age=19;
        std1.name="khushi";
        std1.printname();;
                
    }
    
}
