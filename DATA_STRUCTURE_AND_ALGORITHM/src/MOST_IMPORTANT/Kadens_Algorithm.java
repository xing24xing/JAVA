/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package MOST_IMPORTANT;

/**
 *
 * @author khushi pandey
 */
public class Kadens_Algorithm {

    public static int maxSubArray(int [] nums){
    int maxSofar = nums[0];
    int maxEndingHere = nums[0];
    for(int i = 1;i  < nums.length;i++){
//        System.out.println(i+"  | 1 nums[i] | "+nums[i]);
        maxEndingHere = Math.max(nums[i], maxEndingHere + nums[i]);
//        System.out.println(i+"  | 2 nums[i] | "+nums[i]);
//        System.out.println(i+" | maxEndingValue | "+maxEndingHere);
        maxSofar = Math.max(maxSofar, maxEndingHere);
        System.out.print("["+i+" | maxSofar  | "+maxSofar+"]");
    }
    return maxSofar;
//   for(int i = 1;i < nums.length;i++){
//       if(maxEndingHere < nums[i]){
//           maxEndingHere += nums[i];
//       }
//        if(maxEndingHere > maxSofar){
//             maxSofar = maxEndingHere;
//       }
//   }
   
//    for(int i = 1;i < nums.length;i++){
//      
//           maxEndingHere += nums[i] ;
//         if(maxEndingHere >maxSofar ){
//             maxSofar = maxEndingHere;
//         }
//         if(maxEndingHere < 0){
//          maxEndingHere = 0;   
//         }
//   }
//   
//    return maxSofar;
//    return maxSofar;
    
}
    
    public static void main(String[] args) {
       int[] nums = {-3,-3,-1,-3,-1,-1,-2,-3,-5,-4};
       int res = maxSubArray(nums);
        System.out.println("Output :"+res);
    }
    
}
