package Array;

/**
 *
 * @author khushi pandey
 */
public class Special_subarray {

    public boolean[] specialSubarrays(int[] nums, int[][] queries) {
        int n = nums.length;
        boolean[] answer = new boolean[queries.length];
        
        // Build the prefix array to track adjacent pairs with the same parity
        int[] prefix = new int[n];
        
        for (int i = 1; i < n; i++) {
            // If nums[i] and nums[i-1] have the same parity, increment the prefix count
            if ((nums[i] % 2) == (nums[i - 1] % 2)) {
                prefix[i] = prefix[i - 1] + 1;
            } else {
                prefix[i] = prefix[i - 1];
            }
        }
        
        // Process each query
        for (int q = 0; q < queries.length; q++) {
            int from = queries[q][0];
            int to = queries[q][1];
            
            // If there are no adjacent elements with the same parity in the range [from + 1, to]
            if (from == to) {
                answer[q] = true; // Single element subarrays are always special
            } else {
                // Check if there's any violation (adjacent pairs with the same parity)
                if (prefix[to] - prefix[from] == 0) {
                    answer[q] = true;
                } else {
                    answer[q] = false;
                }
            }
        }
        
        return answer;
    }

    // Method to print the result
    private static void printResult(boolean[] result) {
        for (boolean val : result) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Special_subarray solution = new Special_subarray();
        
        // Test case 1
        int[] nums1 = {3, 4, 1, 2, 6};
        int[][] queries1 = {{0, 4}};
        boolean[] result1 = solution.specialSubarrays(nums1, queries1);
        printResult(result1); // Expected output: [false]

        // Test case 2
        int[] nums2 = {4, 3, 1, 6};
        int[][] queries2 = {{0, 2}, {2, 3}};
        boolean[] result2 = solution.specialSubarrays(nums2, queries2);
        printResult(result2); // Expected output: [false, true]
    }
}
