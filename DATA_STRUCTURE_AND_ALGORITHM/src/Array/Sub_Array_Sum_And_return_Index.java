/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Array;

/**
 *
 * @author khushi pandey
 */
public class Sub_Array_Sum_And_return_Index {

    public static int[] Sum(int []arr,int n,int target){
     int idx = 0;
     int cur = arr[0];
     for(int i = 1;i <= n;i++){
         while(cur > target && idx < i - 1){
             cur -= arr[idx];
             idx++;
         }
         if(cur == target){
             return new int[]{idx+1,i};
         }
         if(i < n){
           cur += arr[i] ;
         }
     }
     return new int[]{-1};
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int [] arr ={5,15,3,4,6,7,9};
        int[] res= Sum(arr,arr.length-1,10);
        if(res.length == 2){
            System.out.println("Subarray found "+res[0]+" and "+res[1]);
        }
        else{
            System.out.println("Subarray Not Found");
        }
        
    }
    
}
