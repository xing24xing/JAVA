/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TYPES_OF_SORTING;

/**
 *
 * @author khushi pandey
 */
//O of logn  partitioning logic

public class quickSort {
     public static void swapped(int[] arr,int i,int j){
      int t = arr[i];
      arr[i] = arr[j];
      arr[j] = t;
  }
     public static int partition(int []arr,int l,int h){
         int pivot = arr[l];
         int i = l;
         int j = h;
         while(i < j){
         while(i < h && arr[i] <= pivot)i++;
         while(arr[j] > pivot ) j--;
         if(i < j){
             swapped(arr,i,j);
         }
         }
//         arr[i] = arr[j];
//         arr
         swapped(arr,l,j);
         return j;
//           int mid = (l + h)/2;
//           int pivot = arr[mid];
           
}
     public static void quick(int []arr,int l,int h ){
//         int pivot;
         if(l < h){
            int  pivot = partition(arr,l,h);
         
         quick(arr,l,pivot-1);
         quick(arr,pivot+1,h);
         }
     }
//     public static int quick(int[] arr,int pivot,int i,int j){
//         
//     }
    public static void main(String[] args) {
        int [] arr = {8,6,7,8,3,2};
//        int pivot = 
        quick(arr,0,arr.length-1);
//        for(int i = 0;i < arr.length;i++)
//        {
//            System.out.println(arr[i]);
//        }
         for (int i : arr) {
            System.out.print(i + " ");
        }
         System.out.println();
    }
    
}
