/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package DynamicProgramming;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author khushi pandey
 */
public class MinimumCostForTickets {
public int mincostTickets(int[] days, int[] costs) {
        // Last day in the days array
        int lastDay = days[days.length - 1];
        // Create a set for travel days for easy lookup
        Set<Integer> travelDays = new HashSet<>();
        for (int day : days) {
            travelDays.add(day);
        }

        // DP array to store the minimum cost up to each day
        int[] dp = new int[lastDay + 1];
        for (int i = 1; i <= lastDay; i++) {
            if (!travelDays.contains(i)) {
                // If no travel on day i, cost is the same as the previous day
                dp[i] = dp[i - 1];
            } else {
                // Calculate the minimum cost considering all three types of passes
                int cost1Day = dp[i - 1] + costs[0];
                int cost7Day = dp[Math.max(0, i - 7)] + costs[1];
                int cost30Day = dp[Math.max(0, i - 30)] + costs[2];
                dp[i] = Math.min(cost1Day, Math.min(cost7Day, cost30Day));
            }
        }

        // The answer is the minimum cost for the last travel day
        return dp[lastDay];
    }

    public static void main(String[] args) {
        MinimumCostForTickets solution = new MinimumCostForTickets();

        // Test case 1
        int[] days1 = {1, 4, 6, 7, 8, 20};
        int[] costs1 = {2, 7, 15};
        System.out.println(solution.mincostTickets(days1, costs1)); // Output: 11

        // Test case 2
        int[] days2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 30, 31};
        int[] costs2 = {2, 7, 15};
        System.out.println(solution.mincostTickets(days2, costs2)); // Output: 17
    }    
}
