/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Heap;
import java.util.*;
/**
 *
 * @author khushi pandey
 */
public class Kth_Largest_Element {

    public static Integer large(int [] arr,int k){
        PriorityQueue <Integer> pq = new PriorityQueue<>();
        for(int i = 0;i < k;i++){
            pq.add(arr[i]);
        }
        for(int i = k;i < arr.length;i++){
            if(pq.peek() < arr[i]){
                pq.poll();
                pq.add(arr[i]);
            }
        }
        return pq.peek();
    }
    public static void main(String[] args) {
       int []arr = {1,4,2,4,5,6};
       int res = large(arr,5);
        System.out.println(res);
    }
    
}
