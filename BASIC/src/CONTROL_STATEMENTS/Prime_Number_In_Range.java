/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CONTROL_STATEMENTS;

import java.util.Scanner;

/**
 *
 * @author khushi pandey
 */
public class Prime_Number_In_Range {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           int i,num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Any Number");
        num=sc.nextInt();
        
//        System.out.print("The Number "+num+" is ");
  
        for(int j=2;j<=num;j++)
        {
           i=2;
        boolean flag=false;
        while(i<=j/2){
            if(j % i == 0)
            {
                flag=true;
                break;
            }
            i++;
        }
        if(flag == false){
            
            System.out.println(j);
        }
        }
    }
    
}
