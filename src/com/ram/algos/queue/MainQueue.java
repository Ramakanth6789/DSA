package com.ram.algos.queue;

public class MainQueue {
    public static void main(String[] args) {
        QueueArray queueArray = new QueueArray(5);
        queueArray.enQueue("Ramakanth");
        queueArray.enQueue("Karthik");
        queueArray.enQueue("Surrendra");
        queueArray.enQueue("Chika");
        queueArray.enQueue("Raghu");
        queueArray.printQueue();
        queueArray.deQueue();
        queueArray.printQueue();
        queueArray.deQueue();
        queueArray.printQueue();
    }
}
