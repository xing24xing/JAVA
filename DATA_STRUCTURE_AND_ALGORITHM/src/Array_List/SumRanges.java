/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Array_List;

/**
 *
 * @author khushi pandey
 */
 import java.util.ArrayList;
import java.util.List;

public class SumRanges {

    public static List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        int n = nums.length;

        if (n == 0) return result; // If array is empty, return an empty list

        int start = nums[0]; // Start of the current range

        for (int i = 1; i < n; i++) {
            // If current number is not consecutive, finalize the range
            if (nums[i] != nums[i - 1] + 1) {
                if (start == nums[i - 1]) {
                    result.add(String.valueOf(start)); // Single number range
                } else {
                    result.add(start + "->" + nums[i - 1]); // Range with start and end
                }
                start = nums[i]; // Update start for the next range
            }
        }

        // Handle the last range
        if (start == nums[n - 1]) {
            result.add(String.valueOf(start));
        } else {
            result.add(start + "->" + nums[n - 1]);
        }

        return result;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(summaryRanges(new int[]{0, 1, 2, 4, 5, 7})); // Output: ["0->2", "4->5", "7"]
        System.out.println(summaryRanges(new int[]{0, 2, 3, 4, 6, 8, 9})); // Output: ["0", "2->4", "6", "8->9"]
        System.out.println(summaryRanges(new int[]{-10, -9, -7, -6, -5, 0, 1})); // Output: ["-10->-9", "-7->-5", "0->1"]
        System.out.println(summaryRanges(new int[]{})); // Output: []
    }
}


