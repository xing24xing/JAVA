/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Recursion;

import java.util.ArrayList;
import java.util.List;

public class PowerSetIterative {
    
    public static List<String> generatePowerSet(String str) {
        List<String> result = new ArrayList<>();
        int n = str.length();
        int powerSetSize = 1 << n; // 2^n
        
        for (int i = 0; i < powerSetSize; i++) {
            StringBuilder subset = new StringBuilder();
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    subset.append(str.charAt(j));
                }
            }
            result.add(subset.toString());
        }
        
        return result;
    }

    public static void main(String[] args) {
        String str = "abc";
        System.out.println(generatePowerSet(str));
        List<String> powerSet = generatePowerSet(str);
        System.out.println("Power Set: " + powerSet);
    }
}
