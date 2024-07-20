/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object_oriented_programming;

//import PRACTICAL.student;

/**
 *
 * @author khushi pandey
 */
//Non Parameterised Constructor
class student{
    String name;
    int age;
    public void printInfo()
    {
        System.out.println(this.age);
        System.out.println(this.name);
    }
    student()
    {
        System.out.println("Constructor Called");
    }
}
public class constructor1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        student std1=new student();
        std1.age=19;
        std1.name="khushi";
        std1.printInfo();
    }
    
}
