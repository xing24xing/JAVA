/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Array;
import java.util.*;
public class Max_Of_Sum_Of_3_Non_Overlapping_Array {
public static int[] maxSumOfThreeSubarrays(int[] nums, int k) {
        int n = nums.length;
        int[] sum = new int[n - k + 1];
        int[] left = new int[n - k + 1];
        int[] right = new int[n - k + 1];
        int[] result = new int[3];
        
        // Compute the sum of each subarray of size k
        int currentSum = 0;
        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
            if (i >= k) currentSum -= nums[i - k];
            if (i >= k - 1) sum[i - k + 1] = currentSum;
        }

        // Compute the best left interval for each position
        int bestLeft = 0;
        for (int i = 0; i < sum.length; i++) {
            if (sum[i] > sum[bestLeft]) bestLeft = i;
            left[i] = bestLeft;
        }

        // Compute the best right interval for each position
        int bestRight = sum.length - 1;
        for (int i = sum.length - 1; i >= 0; i--) {
            if (sum[i] >= sum[bestRight]) bestRight = i; // Use >= for lexicographical order
            right[i] = bestRight;
        }

        // Find the maximum sum by iterating over all middle intervals
        int maxSum = 0;
        for (int mid = k; mid < sum.length - k; mid++) {
            int l = left[mid - k];
            int r = right[mid + k];
            int total = sum[l] + sum[mid] + sum[r];
            if (total > maxSum) {
                maxSum = total;
                result[0] = l;
                result[1] = mid;
                result[2] = r;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 1, 2, 6, 7, 5, 1};
        int k1 = 2;
        System.out.println(Arrays.toString(maxSumOfThreeSubarrays(nums1, k1))); // Output: [0, 3, 5]

        int[] nums2 = {1, 2, 1, 2, 1, 2, 1, 2, 1};
        int k2 = 2;
        System.out.println(Arrays.toString(maxSumOfThreeSubarrays(nums2, k2))); // Output: [0, 2, 4]
    }
    
}
