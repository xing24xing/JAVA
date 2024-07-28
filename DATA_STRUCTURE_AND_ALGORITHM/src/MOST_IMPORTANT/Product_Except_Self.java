/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package MOST_IMPORTANT;


public class Product_Except_Self {
    public static int[] productExceptSelf(int [] arr){
        int n = arr.length;
        int [] res = new int[n];
        
        res[0] = 1;
        System.out.println(n);
        for(int i = 1;i < n;i++){
            System.out.println("res[i - 1] "+res[i - 1]);
            System.out.println("arr[i - 1]"+arr[i - 1]);
            
            res[i] = res[i - 1]*arr[i - 1];
            System.out.println(i+" idx res[i] "+res[i]);
        }
        int right = 1;
        for(int i = n - 1;i >= 0;i--){
            System.out.println("1st res[i] "+res[i]);
            res[i] *= right;
            System.out.println(i+" idx res[i] "+res[i]);
            right *= arr[i];
            System.out.println(i+" idx right "+right);
        }
        return res;
    }

    public static void main(String[] args) {
       int [] arr = {2,2,3,4};
       int[] res= productExceptSelf(arr);
        System.out.println(java.util.Arrays.toString(res));
       
    }
    
}
