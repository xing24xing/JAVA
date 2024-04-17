/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Array;

/**
 *
 * @author khushi pandey
 */
public class Binary_Search_Algorithm {
    
   public static void print(int [] arr)
    {
        System.out.print("{" +arr[0]);
        for(int i=1;i<arr.length;i++)
        {
            System.out.print(" , "+arr[i]);
        }
        System.out.println("}");
    }
  
   public static int search(int arr[],int x)
   {
//      POSTCONDITIONS : return i;
//       if i >= 0 , then arr[i] == x ;otherwise i==-1
      int lower = 0;
      int higher = arr.length;
      while(lower < higher){
//          INVARIANT : if arr[j] == x then lower <= higher ; step 3
       int i = (lower + higher)/2;
       if(arr[i] == x)
       {
           return i;
       }
       else if(arr[i] < x)
       {
           lower = i + 1;
       }
       else
       {
           higher = i;
           
       }
      }
      return -1;
      
   }
    public static void main(String[] args) {
        // TODO code application logic here
        int [] arr = {22,33,44,55,66,77,88,89};
        print(arr);
        System.out.println("search(arr, 44): "+search(arr, 44));
        System.out.println("search(arr, 50): "+search(arr, 50));
        System.out.println("search(arr, 77): "+search(arr, 77));
        System.out.println("search(arr, 100): "+search(arr, 100));
    }
    
}
