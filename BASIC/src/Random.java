/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author khushi pandey
 */
import java.util.Scanner;
public class Random {
 
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter Your Name");
        String name = sc.nextLine();
        
        
        System.out.println("Enter Your Department");
        String depart = sc.nextLine();
        
        
        System.out.println("Enter Your Address");
        String add = sc.nextLine();
        
        System.out.println("Enter Your Blood Group");
        String blood_Group = sc.next();
        
         System.out.println("Enter Your Age");
        int age = sc.nextInt();
        
        System.out.println("Enter Your Phone Number");
        long phone_no = sc.nextLong();
       
        System.out.println("\t\t*******************Infomation************************  ");
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Phone No : "+phone_no);
        System.out.println("Blood Group : "+blood_Group);
        System.out.println("Department : "+depart);
        System.out.println("Address : "+add);
        
        
    }
    
}
