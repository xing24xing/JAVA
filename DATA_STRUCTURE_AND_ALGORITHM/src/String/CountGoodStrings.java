package String;
import java.util.*;

public class CountGoodStrings { // Fixed class name
    public int countGoodStrings(int low, int high, int zero, int one) {
        int mod = 1_000_000_007;
        int[] dp = new int[high + 1];
        dp[0] = 1; // Base case: 1 way to create an empty string

        for (int i = 1; i <= high; i++) {
            if (i >= zero) {
                dp[i] = (dp[i] + dp[i - zero]) % mod;
            }
            if (i >= one) {
                dp[i] = (dp[i] + dp[i - one]) % mod;
            }
        }

        // Sum up all valid lengths from low to high
        int result = 0;
        for (int i = low; i <= high; i++) {
            result = (result + dp[i]) % mod;
        }

        return result;
    }

    public static void main(String[] args) {
        CountGoodStrings gs = new CountGoodStrings(); // Fixed instantiation
        System.out.println(gs.countGoodStrings(3, 3, 1, 1)); // Output: 8
        System.out.println(gs.countGoodStrings(2, 3, 1, 2)); // Output: 5
    }
}
