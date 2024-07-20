/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package MOST_IMPORTANT;


public class Find_The_Missing_Sum {

    public static int findMissingSum(int [] nums){
     int n = nums.length + 1;
        System.out.println(n);
     int totalSum = n *(n + 1)/2;
        System.out.println(totalSum);
     int arraySum = 0;
     for(int num : nums){
         arraySum += num;
     }
     return totalSum - arraySum;
    }
    public static void main(String[] args) {
        int [] nums = {1,2,4,5,6};
        int res = findMissingSum(nums);
        System.out.println("Final Result :" +res);
    }
    
}
