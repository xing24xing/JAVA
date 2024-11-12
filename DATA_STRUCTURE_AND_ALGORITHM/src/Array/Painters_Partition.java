/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Array;

/**
 *
 * @author khushi pandey
 */
public class Painters_Partition {

  public static int partition(int []arr,int m,int n){
       int val = Integer.MIN_VALUE;
       int sum = 0;
       int ans = -1;
       for(int i = 0;i < m;i++){
            sum += arr[i];
            val = Math.max(val,arr[i]);
       }
      int end = sum;
       int st = val;
       while(st <= end){
           int mid = st + (end - st)/2;
           if(isValid(arr,m,n,mid)){
               ans = mid;
               end = mid - 1;
           }else{
               st = mid + 1;
           }
       }
      
               
      return ans;
       
   }
   public static boolean isValid(int []arr,int m,int n,int mid){
       int sum = 0,painter = 1;
       for(int i = 0;i < m;i++){
           if(arr[i] + sum <= mid){
               sum += arr[i];
           }
           else{
               painter++;
               sum = arr[i];
            }
       }
       return painter <= n;
   }
    public static void main(String[] args) {
        // TODO code application logic here
        int [] arr = {40,30,10,20};
       int result = partition(arr,arr.length,2);
        System.out.println("Minimum possible maximum number of pages: " + result);
    }
    
}
