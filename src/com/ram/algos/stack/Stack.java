package com.ram.algos.stack;

public class Stack {
    private int[] arr;
    private int topOfStack;

    public Stack(int size) {
        arr = new int[size];
        topOfStack = -1;
        System.out.println("The stack is created with size: " + size);
    }

    public boolean isEmpty() {
        if (topOfStack == -1) {
            System.out.println("The stack is empty!");
            return true;
        }
        return false;
    }

    public boolean isFull() {
        if (topOfStack == arr.length - 1) {
            System.out.println("the stack if full");
            return true;
        }
        return false;
    }

    public void push(int num) {
        if (isFull()) {
            System.out.println("Stack is FULL!");
        } else {
            topOfStack++;
            arr[topOfStack] = num;
            System.out.println("Value inserted into stack");
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty!");
            return -1;
        } else {
            int value = arr[topOfStack];
            topOfStack--;
            return value;
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return arr[topOfStack];
    }

    public void deleteStack() {
        arr = null;
        System.out.println("Stack deleted");
    }


}
