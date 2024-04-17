/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ARRAY;

/**
 *
 * @author khushi pandey
 */
public class Reverse_2D_Array {

    /**
     * @param args the command line arguments
     */
    public static void reverse(int[] b){
         int left = 0; //index of leftmost element
        int right = b.length-1;
        while(left < right){
            int temp = b[left];
                b[left] = b[right];
                b[right] = temp;
                left++;
                right--;
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int[] b = {1,2,3,4,5,6};
       reverse(b);
    }
    
}
