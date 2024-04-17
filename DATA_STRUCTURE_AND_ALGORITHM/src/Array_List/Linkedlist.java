/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Array_List;

/**
 *
 * @author khushi pandey
 */
import java.util.LinkedList;
import java.util.Queue;
public class Linkedlist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Queue <Integer> queue= new LinkedList<>();
        queue.offer(12);
        queue.offer(24);
        queue.offer(36);
        System.out.println(queue);
       
        System.out.println( queue.poll());
        System.out.println(queue);
    }
    
}
