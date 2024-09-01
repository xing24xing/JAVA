/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TYPES_OF_SORTING;

/**
 *
 * @author khushi pandey
 */
public class SelectionSort {
  public static void selectionSort(int[] arr,int l){
      for(int i = 0;i < l - 1;i++){
          int min = i;
          for(int j = i+1;j < l;j++){
              if(arr[j] < arr[min]){
                  min = j;
              }
          }
          if(min != i){
          swapped(arr,min,i);
      }
      }
  }
  public static void swapped(int[] arr,int i,int j){
      int t = arr[i];
      arr[i] = arr[j];
      arr[j] = t;
  }
    public static void main(String[] args) {
        int [] arr = {3,2,4,1,4};
        selectionSort(arr,arr.length-1);
        for(int i = 0;i < arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        
    }
    
}
