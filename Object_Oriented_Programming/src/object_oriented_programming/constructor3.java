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
class Info{
    String name;
    int age;
    public void printInfo()
    {
        System.out.println(this.age);
        System.out.println(this.name);
    }
    Info(Info s2)
    {
           this.age=s2.age;
           this.name=s2.name;
    }
    Info()
    {
        
    }
}
public class constructor3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Info s1=new Info();
        s1.age=19;
        s1.name="Khushi";
        s1.printInfo();
        Info s2=new Info(s1);
        s2.printInfo();
        
    }
    
}
