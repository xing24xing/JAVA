/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Array;

/**
 *
 * @author khushi pandey
 */
public class ValidNumSplit {

   public int numValidSplits(int[] nums) {
        int n = nums.length;
        // Calculate the prefix sum
        long[] prefixSum = new long[n];
        prefixSum[0] = nums[0];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i];
        }
        
        // Calculate the total sum
        long totalSum = prefixSum[n - 1];
        
        int validSplits = 0;
        for (int i = 0; i < n - 1; i++) {
            long leftSum = prefixSum[i];
            long rightSum = totalSum - leftSum;
            if (leftSum >= rightSum) {
                validSplits++;
            }
        }
        
        return validSplits;
    }

    public static void main(String[] args) {
        ValidNumSplit  solution = new ValidNumSplit ();
        
        // Test cases
        int[] nums1 = {10, 4, -8, 7};
        System.out.println(solution.numValidSplits(nums1)); // Output: 2
        
        int[] nums2 = {2, 3, 1, 0};
        System.out.println(solution.numValidSplits(nums2)); // Output: 2
    }
    
}
