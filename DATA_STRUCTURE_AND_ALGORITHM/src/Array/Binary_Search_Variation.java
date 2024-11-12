/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Array;

/**
 *
 * @author khushi pandey
 */
public class Binary_Search_Variation {
    public static int variation(int [] arr,int t){
        int st = 0;
        int end = arr.length - 1;
        while(st <= end){
            int mid = st + (end - st)/2;
            if(arr[mid] == t){
                System.out.println("It is inside an array");
               return arr[mid];  
               
            } else if(arr[mid] > t){
                end = mid - 1;
//                return arr[end + 1];
                
            }else{
                st = mid + 1;
//                 return arr[mid];
            }
        }
        return arr[st];
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
         int  [] arr = {1,2,3,5,6};
         int res = variation(arr,4);
         System.out.println(res);
    }
    
}
