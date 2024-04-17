/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Array;

import java.util.Arrays;

/**
 *
 * @author khushi pandey
 */
public class Inserting_Array_Element {

    /**
     * @param args the command line arguments
     */
    private static int[] insertElement(int original[], int element , int in)
    {
        int length = original.length;
        int destination[] = new int[length+1];
        System.arraycopy(original, 0, destination, 0,in);
        destination[in] = element;
        System.arraycopy(original, in + 1, destination, in + 1,length - in);
        return destination;
    }
    private static void printArray(String message,int arr[])
    {
        System.out.println(message+" : [Length:  "+arr.length+"]");
        for(int i = 0,n=arr.length; i < n;i++)
        {
            if(i != 0)
            {
                System.out.print(" , ");
                
            }
            System.out.print(arr[i]);
        }
        System.out.println("");
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int arr[]={9,4,6,-3,-7,2,3,-2,5,-9,4};
        Arrays.sort(arr);
        System.out.println(arr+"Sorted Array ");
        int i = Arrays.binarySearch(arr, 9);
        System.out.println("Array Have 9. "+i);
        i = Arrays.binarySearch(arr, 8);
        System.out.println("Array Have Not 8. "+i);
        int i1 = -i -1;
        insertElement(arr,8,i1);
        printArray("In Array 8 is Added ",arr);
               
    }
    
}
