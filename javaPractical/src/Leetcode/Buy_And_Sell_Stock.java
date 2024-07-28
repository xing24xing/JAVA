/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Leetcode;

/**
 *
 * @author khushi pandey
 */
public class Buy_And_Sell_Stock {
   public int maxProfit(int []prices){
//       int minPrice = Integer.MAX_VALUE;
       int minPrice = prices[0];
              
       System.out.println(minPrice);
       int maxProfit = 0;
       for(int p : prices){
           minPrice = Math.min(minPrice, p);
//           System.out.println(p+" minPrice "+minPrice);
           maxProfit = Math.max(maxProfit, p - minPrice );
//           System.out.println(p+" maxProfit "+maxProfit);
       }
       return maxProfit;
   }
    public static void main(String[] args) {
        Buy_And_Sell_Stock buy = new Buy_And_Sell_Stock();
        int []prices = {7,1,5,3,6,4};
        int maxProfit = buy.maxProfit(prices);
        System.out.println("Maximum Profit: "+maxProfit);
    }
    
}
