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
public class Append_Function_In_2D_Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Limit");
        int limit=sc.nextInt();
        int [][] arr1 = new int[limit][limit];
        int [][] arr2 = new int[limit][limit];
        int [][] arr3 = new int[limit][limit];
         System.out.println("Enter The Values For 1st Matrix");
        for(int i=0;i<limit;i++)
        {
            for(int j=0;j<limit;j++)
            {
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter The Values For 2nd Matrix");
          for(int i=0;i<limit;i++)
        {
            for(int j=0;j<limit;j++)
            {
                arr2[i][j] = sc.nextInt();
            }
        }
          System.out.println("U'R First Matrix Is :: ");
            for(int i=0;i<limit;i++)
        {
            for(int j=0;j<limit;j++)
            {
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println("");
        }
            System.out.println("U'R Second Matrix Is :: ");
              for(int i=0;i<limit;i++)
        {
            for(int j=0;j<limit;j++)
            {
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println("");
        }
               for(int i=0;i<limit;i++)
              {
                  for(int j=0;j<limit;j++)
                  {
                    arr3[i][j]=arr1[i][j]+arr2[i][j];
                  }
              }
              System.out.println("Matrix Addition Is :: ");
         for(int i=0;i<limit;i++)
            {
                 for(int j=0;j<limit;j++)
               {
                System.out.print(arr3[i][j]+" ");
               }
             System.out.println("");
            }
        
    }
    
}
