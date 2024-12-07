import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Solution {
    // Function to check if a number is prime
    private boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // BFS-based approach to find the minimum transformation cost
    public int minOperations(int n, int m) {
        // If n is the same as m, no transformation is needed
        if (n == m) return 0;

        // Initialize the queue for BFS, and the visited set to avoid revisiting numbers
        Queue<int[]> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();

        // Start with the initial number 'n' and the accumulated cost (initially n itself)
        queue.offer(new int[]{n, 0});
        visited.add(n);

        // Perform BFS to explore all transformations
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int currentNum = current[0];
            int currentCost = current[1];

            System.out.println("Processing number: " + currentNum + " with accumulated cost: " + currentCost);

            // Convert currentNum to a string to easily access its digits
            String strNum = String.valueOf(currentNum);

            // Try to increase or decrease each digit of currentNum
            for (int i = 0; i < strNum.length(); i++) {
                int digit = strNum.charAt(i) - '0';

                // Try increasing the digit (if it's not 9)
                if (digit < 9) {
                    int newNum = currentNum + (int) Math.pow(10, strNum.length() - 1 - i);
                    if (!visited.contains(newNum) && !isPrime(newNum)) {
                        visited.add(newNum);
                        queue.offer(new int[]{newNum, currentCost + Math.abs(newNum - currentNum)});
                        System.out.println("Increased digit " + digit + " to form " + newNum + " with cost " + (currentCost + Math.abs(newNum - currentNum)));
                    }
                }

                // Try decreasing the digit (if it's not 0)
                if (digit > 0) {
                    int newNum = currentNum - (int) Math.pow(10, strNum.length() - 1 - i);
                    if (!visited.contains(newNum) && !isPrime(newNum)) {
                        visited.add(newNum);
                        queue.offer(new int[]{newNum, currentCost + Math.abs(newNum - currentNum)});
                        System.out.println("Decreased digit " + digit + " to form " + newNum + " with cost " + (currentCost + Math.abs(newNum - currentNum)));
                    }
                }
            }

            // If we reached the target 'm', return the accumulated cost
            if (currentNum == m) {
                System.out.println("Reached target " + m + " with total cost: " + currentCost);
                return currentCost;
            }
        }

        // If no transformation is found, return -1
        System.out.println("Transformation is impossible.");
        return -1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println("Output: " + solution.minOperations(15, 88));
    }
}


