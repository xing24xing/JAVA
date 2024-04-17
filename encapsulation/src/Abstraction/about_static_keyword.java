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
class student{
   String name;
   static String school_name;
   int age;
   public static void changeschool()
   { 
       school_name="oxford";
   }
   
}
public class about_static_keyword {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        student.school_name="L.n college";
        student s1=new student();
        s1.name="khushi";
        s1.age=20;
        System.out.println(s1.age);
        System.out.println(s1.name);
        System.out.println(s1.school_name);
       
    }
    
}
