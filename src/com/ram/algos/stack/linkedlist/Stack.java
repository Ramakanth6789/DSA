package com.ram.algos.stack.linkedlist;


public class Stack {
    LinkedList linkedList;

    public Stack() {
        linkedList = new LinkedList();
    }


    public void push(int value) {
        linkedList.insertInLinkedList(value, 0);
        System.out.println("Inserted " + value + " in Stack");
    }


    public boolean isEmpty() {
        if (linkedList.head == null) {
            return true;
        } else {
            return false;
        }
    }


    public int pop() {
        int result = -1;
        if (isEmpty()) {
            System.out.println("The Stack is Empty!");
        } else {
            result = linkedList.head.value;
            linkedList.deletionOfNode(0);
        }
        return result;
    }


    public int peek() {
        if (isEmpty()) {
            System.out.println("The Stack is Empty!");
            return -1;
        } else {
            return linkedList.head.value;
        }
    }


    public void deleteStack() {
        linkedList.head = null;
        System.out.println("The Stack is deleted");
    }
}

