/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PRACTICE;

/**
 *
 * @author khushi pandey
 */
public class Convert_Tempreature_Into_cel_and_Fer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double celsius1,celsius2,fahrenheit;
        fahrenheit = 40;
        celsius1 = (fahrenheit - 32)/1.8;
        System.out.print("Temperature In Fahrenheit Is "+fahrenheit);
        System.out.println(" Is Converted Into Celsius : "+celsius1);
        fahrenheit = 60;
        celsius2 = (fahrenheit - 32)/1.8;
        System.out.print("Temperature In Fahrenheit Is "+fahrenheit);
        System.out.println(" Is Converted Into Celsius : "+celsius2);
    }
    
}
