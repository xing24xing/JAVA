/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Heap;

/**
 *
 * @author khushi pandey
 */
public class heapDeletion {
 
    public static void swap(int []arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int delete(int arr[],int n){
        arr[0] = arr[n-1];
         
         int i = 0;
         if (n == 0 || n == 1) {
           return n;
        }
        n = n - 1;
    
         while(i < n){
             int l =arr[i * 2];
             int r = arr[(i * 2) + 1];
             int large = l > r ? (2 *i):((2*i) +1);
             if(arr[i] < arr[large]){
                 swap(arr,i,large);
                 i = large;
             }
             if(n > large){
                 break;
             }
             else{
                 break;
             }
         }
        return n;
       
    }
    public static void main(String[] args) {
        int [] arr = {30};
        int res = delete(arr,arr.length);
        for (int i = 0; i < res; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
}
