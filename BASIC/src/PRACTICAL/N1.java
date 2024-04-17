/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PRACTICAL;

/**
 *
 * @author khushi pandey
 */
class student{
    String name;
     int age;
     public void printInfo()
     {   System.out.println(this.age);
         System.out.println(this.name); }
     student()
     { System.out.println("1.)This Is Default Constructor...."); }
    student(String name,int age)
     {   System.out.println("2.)This Is Parameterised Constructor to Print Name & Age....");
         this.name=name;
         this.age=age;}
     student(student s1)
     { System.out.println("3.)Copy Constructor Is Called  to Print Name & Age....");
       this.age=s1.age;
       this.name=s1.name;} }
public class N1 {
    public static void main(String[] args) {
        // TODO code application logic here
        student s2= new student();
        s2.age=18;
        s2.name="khouoshie";
        s2.printInfo();
        student s1=new student("khushi",19);
        s1.printInfo();
        student s3=new student(s1);
        s3.age=20;
        s3.name="Xing";
        s3.printInfo(); } }
