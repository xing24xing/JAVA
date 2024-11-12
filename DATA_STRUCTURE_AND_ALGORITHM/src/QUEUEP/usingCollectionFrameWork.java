/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package QUEUEP;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class usingCollectionFrameWork {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Using Java's Queue interface with LinkedList implementation
//        Queue<Integer> q = new LinkedList<>();
        Queue<Integer> q = new ArrayDeque<>();

        // Correct methods to add elements to the queue
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);

        // Displaying the queue elements
//        System.out.println("Queue elements: " + q);
            while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
            
        }
    }
}
