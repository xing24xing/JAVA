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
public class Max_And_Min_Value_In_Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Limit Of An Array");
        int limit = sc.nextInt();
        int [] arr = new int[limit];
        System.out.println("Enter The Value In Array");
        for(int i=0;i<limit;i++){
               arr[i]=sc.nextInt();
        }
        System.out.println("Entered Values Are : \n");
        for(int i=0;i<limit;i++)
        {
            System.out.print(arr[i]+"\t");
        }
        int min,max;
        min = max = arr[0];
       for(int i=0;i<limit;i++)
       {
           if(max < arr[i])
           {
               max = arr[i];
           }
           else if(min > arr[i])
           {
               min = arr[i];
           }
       }
        System.out.println("\n\nMaximum Value In Array Is : "+max);
        System.out.println("\nMinimum Value In Array Is : "+min);
    }
    
}
