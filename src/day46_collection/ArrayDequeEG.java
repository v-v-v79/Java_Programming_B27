package day46_collection;

import java.util.ArrayDeque;

public class ArrayDequeEG {
    public static void main(String[] args) {
        ArrayDeque<String> deque = new ArrayDeque<>();
        deque.offer("a");
        deque.offer("b");
        deque.offer("c");
        deque.offer("d");

        System.out.println(deque);
        System.out.println(deque.peek());
        System.out.println(deque.poll());
        System.out.println(deque);
        System.out.println(deque.peek());

        deque.offerFirst("f");
        System.out.println(deque);
        deque.offerLast("e");
        System.out.println(deque);
        deque.poll();
        System.out.println(deque);
        deque.pollLast();
        System.out.println(deque);
    }
}
