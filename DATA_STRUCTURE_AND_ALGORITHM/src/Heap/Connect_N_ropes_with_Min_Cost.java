/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Heap;

import java.util.PriorityQueue;

/**
 *
 * @author khushi pandey
 */
public class Connect_N_ropes_with_Min_Cost {
   
    public static int connect(int[] arr){
        PriorityQueue <Integer> pq = new PriorityQueue<>();
        for(int i = 0;i < arr.length;i++){
            pq.add(arr[i]);
        }
        int res = 0;
        while(pq.size() > 1){
            int f = pq.poll();
            int s = pq.poll();
            int min = f + s;
            res += min;
            pq.add(min);
        }
        return res;
    }
//    6+11+
    public static void main(String[] args) {
       int []arr = {2,5,4,8,6,9};
       int res = connect(arr);
        System.out.println("Minimum Cost : "+res);
    }
    
}
