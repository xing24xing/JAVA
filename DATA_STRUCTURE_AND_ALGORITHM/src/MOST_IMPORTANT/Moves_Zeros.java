/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package MOST_IMPORTANT;

/**
 *
 * @author khushi pandey
 */
public class Moves_Zeros {

    public static void movesZero(int[] nums){
        int lastNonZeroFound = 0;
        for(int i  = 0;i < nums.length;i++){
            if(nums[i] != 0)
                nums[lastNonZeroFound++]= nums[i];
        }
        for(int i = lastNonZeroFound;i < nums.length;i++){
            nums[i] = 0;
        }
    }
    public static void main(String[] args) {
        int [] nums = {0,1,0,3,12};
        movesZero(nums);
//        System.out.println(nums);
        System.out.println("Array After Moving Zeros : " + java.util.Arrays.toString(nums));
    }
    
}
