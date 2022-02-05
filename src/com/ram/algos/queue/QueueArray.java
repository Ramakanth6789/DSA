package com.ram.algos.queue;

public class QueueArray {
    private String[] array;
    private int topOfQueue;
    private int beginningOfQueue;

    public QueueArray(int size) {
        array = new String[size];
        this.topOfQueue = -1;
        this.beginningOfQueue = -1;
    }

    public boolean isFull() {
        if (topOfQueue == array.length - 1) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        if (beginningOfQueue == -1 || beginningOfQueue == array.length) {
            return true;
        }
        return false;

    }

    public void enQueue(String value) {
        if (isFull()) {
            System.out.println(" Queue is full. No new value can be inserted! ");
        } else if (isEmpty()) {
            beginningOfQueue = 0;
            topOfQueue++;
            array[beginningOfQueue] = value;
        } else {
            topOfQueue++;
            array[topOfQueue] = value;
        }

    }

    public String deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty!");
            return "";
        }
        String result = array[beginningOfQueue];
        beginningOfQueue++;
        if (beginningOfQueue > topOfQueue) {
            beginningOfQueue = topOfQueue = -1;
        }
        return result;
    }

    public String peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty!");
            return "";
        }
        return array[beginningOfQueue];
    }

    public void delete() {
        array = null;
        System.out.println("Queue Deleted!");
    }

    public void printQueue() {
        for (int i = beginningOfQueue; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print("->");
            }
        }
        System.out.println();
    }
}
