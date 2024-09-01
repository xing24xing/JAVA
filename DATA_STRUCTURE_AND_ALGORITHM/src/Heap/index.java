/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Heap;

/**
 *
 * @author khushi pandey
 */
public class index {

   public static void insert(int [] arr,int n,int value){
       n = n + 1;
       arr[n] = value;
       int i = n;
       while(i > 1){
           int parent = i / 2;
           if(arr[parent] < arr[i]){
               swap(arr,parent,i);
               i = parent;
           }else{
               return ;
           }
       }
       
   }
   public static void swap(int [] arr,int parent,int i){
       int temp = arr[parent];
       arr[parent]= arr[i];
       arr[i] = temp;
       
   }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
