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

    public void insertLinkedList(int nodeValue, int location) {
        Node node = new Node();
        node.value = nodeValue;
        if (head == null) {
            createLinkedlist(nodeValue);
            return;
        } else if (location == 0) {
            node.next = head;
            head = node;
            tail.next = head;
        } else if (location >= size) {
            tail.next = node;
            tail = node;
            tail.next = head;
        } else {
            Node tempNode = head;
            int index = 0;
            while (index < location-1) {
                tempNode = tempNode.next;
                index++;
            }
            node.next = tempNode.next;
            tempNode.next = node;
        }
        size++;

    }

    public void traverseLinkedList() {
        Node node = head;
        for (int i = 0; i < size; i++) {
            System.out.print(node.value);
            if (i != size - 1) {
                System.out.print(" -> ");
            }
            node = node.next;
        }
        System.out.println();
    }

}
