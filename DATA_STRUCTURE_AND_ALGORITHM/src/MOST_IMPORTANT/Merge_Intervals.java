/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package MOST_IMPORTANT;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author khushi pandey
 */
public class Merge_Intervals {
    public static int[][]  merge(int [][] intervals){
        if(intervals.length <= 1){
            return intervals;
        }
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        List<int[]> res = new ArrayList<>();
        int[] current = intervals[0];
          res.add(current);
          for(int[] interval : intervals){
           if(interval[0] <= current[1]){
               current[1] = Math.max(current[1], interval[1]);
           }else{
               current = interval;
               res.add(current);
           }
    }
        return res.toArray(new int[res.size()][]);
    }
    public static void main(String[] args) {
        int [][] intervals = {{1,3},{2,6},{8,10},{15,16}};
        int [][] merged = merge(intervals);
        for(int[] interval : merged){
            System.out.println(Arrays.toString(interval));
        }
    }
    
}
