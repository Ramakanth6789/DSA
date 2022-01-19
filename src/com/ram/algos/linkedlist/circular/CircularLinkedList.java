package com.ram.algos.linkedlist.circular;

public class CircularLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public Node createLinkedlist(int nodeValue) {
        Node node = new Node();
        node.value = nodeValue;
        node.next = node;
        head = node;
        tail = node;
        size = 1;
        return head;
    }
}
