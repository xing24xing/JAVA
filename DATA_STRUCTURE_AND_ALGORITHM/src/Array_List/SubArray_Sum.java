/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Array_List;


import java.util.ArrayList;

/**
 *
 * @author khushi pandey
 */
public class SubArray_Sum {
    public static ArrayList<Integer> Sum(int []arr,int n,int target){
        ArrayList <Integer> res = new ArrayList<>();
        int idx = 0;
        System.out.println(n);
        int cur = arr[0];
        for(int i = 1;i <= n;i++){
            while(cur > target &&  idx < i - 1){
                cur -= arr[idx];
                idx++;
            }
            if(target == cur){
                res.add(idx+1);
                res.add(i);
                return res;
               
            }
            if(i < n){
                cur += arr[i];
            }
        }
         res.add(-1);
        return res;
    }
    public static void main(String[] args) {
       int [] arr ={5,15,5,3};
        ArrayList<Integer> res = Sum(arr,arr.length,20);
        if(res.size() == 2){
            System.out.println("Subarray found "+res.get(0)+" and "+res.get(1));
        }
        else{
            System.out.println("Subarray Not Found");
        }
    }
    
}
