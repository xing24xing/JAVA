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
public class INSERTION_SORT {

 
    public static void Insertion_sort(int arr[], int limit)
    {
        for (int i = 1; i < limit; i++) {
            int temp = arr[i];
            int j;
//             System.out.println("first a[j] : "+arr[j]);
           for( j = i;((j > 0) && (arr [j - 1] > temp));j--)
           {
               arr[j] = arr[j - 1];
//                  System.out.println("current a[j] : "+arr[j]+" : "+j);
           }
            System.out.println("");
           arr[j] = temp;  // 9
            System.out.println("second a[j] : "+arr[j]);
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Limit Of An Array");       
        int limit = sc.nextInt();
        int [] arr = new int[limit];
        System.out.println("Enter The Values Of An Array");
        for(int i = 0;i < limit;i++)
        {
           arr[i] = sc.nextInt();
        }
        System.out.println("Values Before Sorting");
        for (int i = 0; i < limit; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
        Insertion_sort(arr,limit);
        System.out.println("Values Afetr Soting");
        for (int i = 0; i < limit; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nPAUSE........");
 
    }
    
}
