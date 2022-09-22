package day46_collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueEG {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(7);
        queue.add(11);
        queue.add(12);
        queue.add(11);

        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue);
    }
}
