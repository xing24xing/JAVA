/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PRACTICAL;

/**
 *
 * @author khushi pandey
 */
public class Q9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int arr[] = new int[]{10,20,30,40,50};
        int min = arr[0];
        int max = arr[0];
        for(int i = 0;i<arr.length;i++)
        {
            if(arr[i]>min)
            {
                min = arr[i];
            }
            else
            {
                max = arr[i];
            }
        }
        System.out.println("Smallest Element : "+min);
        System.out.println("Largest Element :"+max);
    }
    
}
