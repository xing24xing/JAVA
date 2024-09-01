/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Array;

/**
 *
 * @author khushi pandey
 */
public class Search_An_Infinite_Sorted_Array {
    public static int binary(int [] n,int key,int l,int h){
        boolean flag;
     while(l <= h)   {
         int mid = (l + h)/2;
         try{
         if(n[mid] == key){
             return mid;
         }else if(n[mid] > key){
             h = mid - 1;
         }else if(n[mid] < key){
             l = mid + 1;
         }
         }catch(ArrayIndexOutOfBoundsException e){
             h = mid - 1;
         }
     }
       return -1;
    }
     public static int find(int[] n,int key){
         int l = 0;
         int h = 1;
         while(true){
             try{
         if(n[h] < key){
             l = h;
             h = 2 * h;
             
         }else{
             break;
         }
             }
             catch(ArrayIndexOutOfBoundsException e){
                 break;
             }
         }
         return binary(n,key,l,h);
         
     }
    public static void main(String[] args) {
        // TODO code application logic here
        int [] n = {1,2,3,4,5,67,89};
        int res = find(n,67);
        if(res != -1){
            System.out.println("Found at index : "+res);
        }else{
            System.out.println("Not Found");
        }
        
        
    }
    
}
