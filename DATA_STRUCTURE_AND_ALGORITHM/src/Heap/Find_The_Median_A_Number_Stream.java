package Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class Find_The_Median_A_Number_Stream {

    PriorityQueue<Integer> min = new PriorityQueue<>();
    PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());

    public void addNumber(int num) {
        if (max.isEmpty() || max.peek() >= num) {
            max.add(num);
        } else {
            min.add(num);
        }

        // Balance the heaps
        if (max.size() > min.size() + 1) {
            min.add(max.poll());
        } else if (min.size() > max.size()) {
            max.add(min.poll());
        }
    }

    public double findMedian() {
        if (max.size() == min.size()) {
            return (max.peek() + min.peek()) / 2.0;
        }
        return max.peek();
    }

    public static void main(String[] args) {
        Find_The_Median_A_Number_Stream medianFinder = new Find_The_Median_A_Number_Stream();
        int[] arr = {3, 4, 1, 5};

        for (int num : arr) {
            medianFinder.addNumber(num);
            System.out.println("Current median: " + medianFinder.findMedian());
        }
    }
}
