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
      System.out.println(map);
      for(int i = 0;i < nums.length;i++){
          int com = target - nums[i];
          System.out.println("2  "+com+" : "+i);
          System.out.println("3  "+map.containsKey(com)+" : "+i);
          if(map.containsKey(com))
          {
              System.out.println(map);
              return new int[] {map.get(com),i};
              
          }
      
          map.put(nums[i], i);
          System.out.println(nums[i]);
      }
      throw new IllegalArgumentException();
      
//      return new int[] {map.get(com),i};
//      return com;
  }
    public static void main(String[] args) {
        // TODO code application logic here
        int [] nums = {6,7,11,15,2};
        int target = 9;
        int[] result = twoSum(nums,target);
        System.out.println("Result :"+result[0]+" , "+result[1]);
    }
    
}
