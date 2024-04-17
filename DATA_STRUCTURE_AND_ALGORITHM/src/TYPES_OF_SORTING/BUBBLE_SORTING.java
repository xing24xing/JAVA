/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TYPES_OF_SORTING;

/**
 *
 * @author khushi pandey
 */
import java.util.Scanner;
public class BUBBLE_SORTING {

   public static void bubble_sorting(int arr[],int limit)
   {
     for(int i = 0;i < limit;i++)       
     {
         for(int j = 1;j < (limit - i);j++)
         {
             if(arr[j - 1] > arr[j])
             {
                 int t = arr[j - 1];
                 arr[j - 1] = arr[j];
                 arr[j] = t;
             }
         }
     }
   }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Limit Of Array");
        int limit = sc.nextInt();
        int [] arr = new int[limit];
        System.out.println("Enter Values In Array");
        for(int i = 0;i < limit;i++)
        {
           arr[i] = sc.nextInt();
        }
        System.out.println("Values Before Sorting");
        for(int i = 0;i < limit;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
        bubble_sorting(arr,limit);
        System.out.println("Values After Sorting");
        for(int i = 0;i < limit;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nPAUSE...........");
    }
    
}
