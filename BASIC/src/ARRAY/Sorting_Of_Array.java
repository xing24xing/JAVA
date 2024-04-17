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
class srt{
    int limit;
    public int [] arr = new int[100];
    Scanner sc=new Scanner(System.in);
    srt()
    {
        System.out.println("Enter The Limit");
        limit = sc.nextInt();
        
    }
    public void getdata(){
        System.out.println("Enter The Elements");
        for(int i=0;i<limit;i++){
            arr[i] = sc.nextInt();
        }
    }
    public void display(){
        System.out.println("Elements Before Sorting");
        for(int i=0;i<limit;i++){
           System.out.print(arr[i]+"\t");
       }
        for(int i=0;i<limit;i++)
        {
            for(int j=i+1;j<limit;j++)
            {
                if(arr[i]>arr[j]){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            
        }
        }
    }
      public void setdata(){
          System.out.print("\nAfter Sorting Array Elements\n");
          for(int i=0;i<limit;i++) {
              System.out.print(arr[i]+"\t");
          }
    }
    
}
public class Sorting_Of_Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      srt s = new srt();
      s.getdata();
      s.display();
      s.setdata();
    }
    
}
