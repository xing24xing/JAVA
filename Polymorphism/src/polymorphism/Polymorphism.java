/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;
//importBank;
/**
 *
 * @author khushi pandey
 */
//import java.util.Scanner
//import bank;
class Info2{
    String name;
    int age;
    public void printInfo()
    {
        System.out.println(name);
    }
    public void printinfo(int age)
    {
        System.out.println(age);
    }
    public void printInfo(String name,int age)
    {
        System.out.println(name);
        System.out.println(age);
    }
}
public class Polymorphism {

    /**
     * @param args the command line arguments
     */
   //compile time Poly Or function overloading
    
    public static void main(String[] args) {
        // TODO code application logic here
        Info2 s1=new Info2();
        s1.age=19;
        s1.name="khushi";
        s1.printInfo();
        s1.printinfo(15);
        s1.printInfo("Xing-Xing", 20);
//        
    }
    
}
