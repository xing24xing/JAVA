package MOST_IMPORTANT;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Map<String, List<String[]>> res = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            String[] parts = line.split("=");
            String op = parts[0].trim();
            String[] ing = parts[1].trim().split("\\+");
            res.putIfAbsent(op, new ArrayList<>());
            res.get(op).add(ing);
        }
        
        String target = sc.nextLine().trim();
        Map<String, Integer> memo = new HashMap<>();
        int result = findMin(target, res, memo);
        System.out.println(result); // Corrected to print the result
    }

    private static int findMin(String op, Map<String, List<String[]>> res, Map<String, Integer> memo) {
        if (!res.containsKey(op)) {
            return 0; // Base case: items require 0 magical orbs
        }

        if (memo.containsKey(op)) {
            return memo.get(op);
        }

        int min = Integer.MAX_VALUE;

        for (String[] ing : res.get(op)) {
            int cur = ing.length - 1; // Count magical orbs for this recipe
            for (String i : ing) {
                cur += findMin(i.trim(), res, memo); // Recursive call for each ingredient
            }
            min = Math.min(min, cur);
        }

        memo.put(op, min);
        return min;
    }
}
