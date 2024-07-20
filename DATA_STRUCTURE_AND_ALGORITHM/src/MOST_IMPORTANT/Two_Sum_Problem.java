/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package MOST_IMPORTANT;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author khushi pandey
 */
public class Two_Sum_Problem {
  public static int[] twoSum(int[] nums,int target){
      Map<Integer , Integer> map = new HashMap<>();
      for(int i = 0;i < nums.length;i++){
          int com = target - nums[i];
          if(map.containsKey(com))
          {
              return new int[] {map.get(com),i};
              
          }
          map.put(nums[i], i);
      }
//      throws new IllegalArgumentException("No Two Sum Solution");
//      return new int[] {map.get(com),i};
  }
    public static void main(String[] args) {
        // TODO code application logic here
        int [] nums = {2,7,11,15};
        int target = 9;
        int[] result = twoSum(nums,target);
        System.out.println("Result :"+result);
    }
    
}
