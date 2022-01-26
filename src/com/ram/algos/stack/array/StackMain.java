package com.ram.algos.stack.array;

public class StackMain {
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.peek();
        stack.isFull();
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();

    }
}
