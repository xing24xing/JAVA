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
public class Aggressive_Cow {

    public static int cows(int []arr,int m,int n){
      Arrays.sort(arr);
      
        int st = 1,ans = -1;
        int end = arr[n - 1] - arr[0];
        while(st <= end){
            int mid = st + (end - st)/2;
            if(isValid(arr,m,n,mid)){
                ans = mid;
                st = mid + 1;
            }else{
                end = mid - 1;
            }
            
        }
        return ans;
    }
    public static boolean isValid(int [] arr,int m,int n,int mid){
       
        int val = arr[0],cows = 1;
        for(int i = 1;i < n;i++){
            if(arr[i] - val >= mid){
                cows++;
                val = arr[i];
            }
            if(cows == m){
                return true;
            }
        }
//        return cows >= m;
            return false;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int [] arr = {1,2,8,4,9};
        int res = cows(arr,3,arr.length);
        System.out.println(res);
    }
    
}
