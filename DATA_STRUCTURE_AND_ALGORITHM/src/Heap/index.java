/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Heap;


public class index {

   public static int insert(int [] arr,int n,int value){
       // Increase the size of the heap
        n = n + 1;
        // Ensure the array is large enough to hold the new element
        if (n >= arr.length) {
            System.out.println("Array is full, cannot insert new element");
            return n - 1; // Return the old size if array is full
        }

        // Insert the new value at the end
        arr[n] = value;
        int i = n;

        // Fix the heap property by bubbling up
        while (i > 1) {
            int parent = i / 2;
            if (arr[parent] < arr[i]) {
                swap(arr, parent, i);
                i = parent;
            } else {
                break;
            }
        }

        return n; // Return the new size after insertion
    }

    public static void swap(int[] arr, int parent, int i) {
        int temp = arr[parent];
        arr[parent] = arr[i];
        arr[i] = temp;
    }
    public static void main(String[] args) {
        int[] arr = new int[100]; // Adjust size as needed
        arr[0] = 50;
        arr[1] = 30;
        arr[2] = 40;
        arr[3] = 10;
        arr[4] = 5;
        arr[5] = 20;
        arr[6] = 30;

        int n = 6; // Current number of elements

        n = insert(arr, n, 60);
        n = insert(arr, n, 7);
        n = insert(arr, n, 9);
        n = insert(arr, n, 1);

        // Print the heap to verify the result
        for (int i = 0; i <= n; i++) {
            System.out.print(arr[i] + " ");
        }
    
    }
    
}
