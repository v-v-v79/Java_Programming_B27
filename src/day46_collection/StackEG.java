package day46_collection;

import java.util.Stack;

public class StackEG {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.push("d");

        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
        System.out.println(stack);
    }
}
