/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Array;

/**
 *
 * @author khushi pandey
 */
public class Mountain {
    public static int mount(int []arr,int s,int e){
       while(s <= e){
           int mid = s +(e - s)/2;
             // Boundary check to avoid ArrayIndexOutOfBoundsException
            if (mid > 0 && mid < arr.length - 1) {
                if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                    // If the middle element is the peak
                    return mid;
                } else if (arr[mid] < arr[mid + 1]) {
                    // If the right side is increasing, move to the right
                    s = mid + 1;
                } else {
                    // If the left side is increasing, move to the left
                    e = mid - 1;
                }
            } else {
                // Handle edge cases (if mid is at the beginning or end of the array)
                return -1;  // Not a valid peak
            }
        }
        return -1;  // No peak found
    }
    public static void main(String[] args) {
       int[] arr = {0,3,8,5,9,2};  // Example mountain array
        int peakIndex = mount(arr, 2, arr.length - 2);
        System.out.println("Peak element index: " + peakIndex);
    }
    
}
