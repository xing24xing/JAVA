/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author khushi pandey
 */
import java.io.*;
class Employee{
    
    public String name;  //this instance variable visible for any child class .
    private double salary;  //salary variable is visible in employee class only.
    public Employee(String empname){   //name variable is assigned in the constructor.
        name=empname;
    }
    public void setSalary(double empsalary){// the salary variable is assigned a value
        salary=empsalary;
    }
    public void printEmp()
    {   //this method prints employee datails.
        System.out.println("Name:- "+name);
        System.out.println("Salary:- "+salary);
    }
}
public class Instacnce_Variable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Employee E=new Employee("xing-xing");
        E.setSalary(5000000.45);
        E.printEmp();
        
    }
    
}
