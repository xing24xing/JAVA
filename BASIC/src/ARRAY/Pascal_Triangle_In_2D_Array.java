/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ARRAY;

/**
 *
 * @author khushi pandey
 */
import java.util.*;
import java.lang.*;
public class Pascal_Triangle_In_2D_Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Limit");
        int limit = sc.nextInt();
        int triangle [][] = new int [limit][limit];
        for(int i=0;i<limit;i++)
        {
            for(int j=0;j<limit;j++)
            {
                triangle[i][j] = 0;
            }
        }
        for(int i=0;i<limit;i++){
            triangle[i][0] = 1;
        }
        for(int i=1;i<limit;i++)
        {
            for(int j=1;j<limit;j++)
            {
               
                triangle[i][j] = triangle[i-1][j-1] + triangle[i-1][j];
            
            }
            
        }
        
        for(int i=0;i<limit;i++)
        {
            for(int j=0;j<limit;j++)
            {
                 if(triangle[i][j] != 0)
                {
                System.out.print(triangle[i][j]);
            }
                 
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        
    }
    
}
