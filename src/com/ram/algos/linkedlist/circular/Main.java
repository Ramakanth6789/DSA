package com.ram.algos.linkedlist.circular;

public class Main {
    public static void main(String[] args) {
        CircularLinkedList circularLinkedList = new CircularLinkedList();
        Node head = circularLinkedList.createLinkedlist(5);
        System.out.println(head.value);
        System.out.println(head.next.value);
    }
}
