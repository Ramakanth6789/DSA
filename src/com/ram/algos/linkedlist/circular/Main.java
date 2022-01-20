package com.ram.algos.linkedlist.circular;

public class Main {
    public static void main(String[] args) {
        CircularLinkedList circularLinkedList = new CircularLinkedList();
        Node head = circularLinkedList.createLinkedlist(5);
        circularLinkedList.insertLinkedList(1,2);
        circularLinkedList.insertLinkedList(3, 3);
        circularLinkedList.insertLinkedList(6, 4);
        System.out.println(head.value);
        System.out.println(head.next.next.value);
        System.out.println("------");

        circularLinkedList.traverseLinkedList();
    }
}
