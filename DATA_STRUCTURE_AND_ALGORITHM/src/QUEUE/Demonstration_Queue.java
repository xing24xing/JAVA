/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package QUEUE;


class Queue{
    private int maxSize;
    private long[] queArray;
    private int front;
    private int rear;
    private int nitems;
    public Queue(int s){ //constructor
        maxSize =  s;
        front = 0;
        rear = -1;
        nitems = 0;
    }
    public void insert(long j)  //put an item at rear of queue
    {
        if(rear == (maxSize - 1))   //deal with wraparound
        {
            rear = -1;
            queArray[++rear] = j;    // increment rear and insert
            nitems++;  //one more item
        }
    }
    public long remove() // take item from front of queue
    {
        long temp = queArray[front++];
        if(front == maxSize) // deal with wraparound
            front = 0;
            nitems--;
            return temp;
    }
    public long peekFront() // peek at front of queue
    {
        return queArray[front];
    }
    public boolean isEmpty()  // true if queue is empty
    {
        return (nitems == 0);
    }
    public boolean isFull() // true if queue is full
    {
        return (nitems == maxSize);
    }
    
    public int size()
    {
        return nitems;
    }
}
public class Demonstration_Queue {

   
    public static void main(String[] args) {
        // TODO code application logic here
        Queue q = new Queue(5);
        q.insert(10);
        q.insert(20);
        q.insert(30);
        q.insert(40);
        q.insert(50);
        q.remove();
        q.remove();
        q.remove();
        q.insert(60);
        q.insert(70);
        q.insert(80);
        q.insert(90);
        while(!q.isEmpty())//display and remove
        {
            long n = q.remove();
            System.out.print(n);
            System.out.print(" ");
        }
        System.out.println("");
    }
    
}
