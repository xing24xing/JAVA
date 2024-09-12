/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Heap;

/**
 *
 * @author khushi pandey
 */
//heapify  not O(nlogn) it is O(n)
public class Heapify {
   public static void swap(int arr[],int i ,int j){
       int temp = arr[i];
       arr[i] = arr[j];
       arr[j] = temp;
   }
    // Function to heapify a subtree rooted at index i
    public static int sort(int arr[],int n,int i){
//        i = current index
        int large = i;
//        System.out.println("l : "+large);
        int l = 2*i+1;
        int r = 2*i+2;
        if(l < n && arr[l]< arr[large]){
            large = l;
        }
         if(r < n && arr[r]< arr[large]){
            large = r;
        }
         if(large != i){
             swap(arr,i,large);
             sort(arr,n,large);
         }
         return n;
    }
    public static void heapSort(int arr[]) {
        int n = arr.length;

        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--) {
            System.out.println("i :" + i);
            sort(arr, n, i);
        }

        // Extract elements from heap one by one
     for (int i = n - 1; i > 0; i--) {
        // Move current root to end
           swap(arr, 0, i);
//
//            // Call heapify on the reduced heap
           sort(arr, i, 0);
     }
    }
    public static void main(String[] args) {
        int []arr  = {20,30,40,50,4,2};
        heapSort(arr);
        for(int i = 0;i < arr.length-1;i++){
            System.out.println(arr[i]);
        }
    }
    
}
