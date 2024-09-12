/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Heap;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 *
 * @author khushi pandey
 */
public class priority {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.add(3);
        pq.add(9);
        pq.add(5);
//        System.out.println("Size : "+pq.size());
        System.out.println(pq);
        while(!pq.isEmpty()){
            System.out.println(pq.peek());
            pq.poll();
        }
    }
    
}
