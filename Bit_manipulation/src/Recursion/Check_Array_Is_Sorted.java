/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

/**
 *
 * @author khushi pandey
 */
import java.util.Scanner;
public class Check_Array_Is_Sorted {

    public static boolean issorted(int arr[],int idx,int r)
    {
        if(idx==r-1)
        {
//              System.out.println(idx);
            return true;
        }
        if(arr[idx]>arr[idx+1])
        {
            
            System.out.println("Val "+arr[idx]);
           return issorted(arr,idx+1,r);
        }
        else{
            return false;
        }
       
    }
    public static void main(String[] args) {
        // TODO code application logic here
//        Scanner sc=new Scanner(System.in);
//        int [] array=new int[100];
//        System.out.println("Enter The Range Of An Array");
//        int range=sc.nextInt();
//        System.out.println("Enter The Elements");
//        for(int i=0;i<range;i++)
//        {
//            array[i]=sc.nextInt();
//        }
//        System.out.println(issorted(array,0,range-1)); 
//        
   int [] arr = {1,2,6,3,4,5};
   boolean res = issorted(arr,0,arr.length);
        System.out.println(res);
        
        
    }
    
}
