/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Heap;

import java.util.*;

class Solution {
    public int maxRemovableQueries(int[] nums, int[][] queries) {
        int n = nums.length;
        int qLen = queries.length;

        // To store the impact of queries on nums
        int[] impact = new int[n];

        // Apply all queries and accumulate their impact
        for (int[] query : queries) {
            int l = query[0], r = query[1];
            for (int i = l; i <= r; i++) {
                impact[i]++;
            }
        }

        // Helper function to check if nums can still be reduced to 0 after removing queries
        boolean canMakeZeroArray(int[] nums, int[] impact, int queriesToRemove) {
            int[] tempImpact = Arrays.copyOf(impact, n);
            int removed = 0;
            for (int i = 0; i < queries.length; i++) {
                if (removed >= queriesToRemove) {
                    break;
                }
                int l = queries[i][0], r = queries[i][1];
                // Check if the query can be removed
                boolean canRemove = true;
                for (int j = l; j <= r; j++) {
                    if (nums[j] > tempImpact[j]) {
                        canRemove = false;
                        break;
                    }
                }

                // If the query can be removed, update the impact and increase the removal count
                if (canRemove) {
                    removed++;
                    for (int j = l; j <= r; j++) {
                        tempImpact[j]--;
                    }
                }
            }

            // If we managed to remove the desired number of queries and still can make the array zero
            for (int i = 0; i < n; i++) {
                if (nums[i] > tempImpact[i]) {
                    return false;
                }
            }

            return true;
        }

        // Perform binary search to find the maximum removable queries
        int left = 0, right = qLen;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (canMakeZeroArray(nums, impact, mid)) {
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        // Test case 1
        int[] nums1 = {2, 0, 2};
        int[][] queries1 = {{0, 2}, {0, 2}, {1, 1}};
        System.out.println("Max removable queries for Example 1: " + sol.maxRemovableQueries(nums1, queries1)); // Expected output: 1

        // Test case 2
        int[] nums2 = {1, 1, 1, 1};
        int[][] queries2 = {{1, 3}, {0, 2}, {1, 3}, {1, 2}};
        System.out.println("Max removable queries for Example 2: " + sol.maxRemovableQueries(nums2, queries2)); // Expected output: 2

        // Test case 3
        int[] nums3 = {1, 2, 3, 4};
        int[][] queries3 = {{0, 3}};
        System.out.println("Max removable queries for Example 3: " + sol.maxRemovableQueries(nums3, queries3)); // Expected output: -1
    }
}
