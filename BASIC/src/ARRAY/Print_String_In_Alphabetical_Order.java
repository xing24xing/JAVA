/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ARRAY;

/**
 *
 * @author khushi pandey
 */
import java.util.Scanner;
public class Print_String_In_Alphabetical_Order {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("How many String U Want To Enter");
        int num = sc.nextInt();
        String [] str = new String[num];
        System.out.println("Enter The String\n");
        for(int i=0;i<num;i++)
        {
            str[i] = sc.next();
        }
        
        int size = str.length;
        String temp = null;
        
        for(int i=0;i<size;i++)
        {
            for(int j=i+1;j<size;j++)
            {
                if(str[j].compareTo(str[i])<0)
                {
                    temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
        System.out.println("\nSorted Srings Are :: ");
        for(int i=0;i<num;i++)
        {
            System.out.println(str[i]);
        }
    }
    
}
