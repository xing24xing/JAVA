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
//parameterised constructor
class std{
    String name;
     int age;
     public void printInfo()
     {
         System.out.println(this.age);
         System.out.println(this.name);
     }
     std()
     {
         System.out.println();
     }
     std(String name,int age)
     {
         this.name=name;
         this.age=age;
     }
}
public class Constructor2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here  
        std s1=new std("khushi",19);
        s1.printInfo();
    }
    
}
