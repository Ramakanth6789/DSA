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
            while (index < location - 1) {
                tempNode = tempNode.next;
                index++;
            }
            node.next = tempNode.next;
            tempNode.next = node;
        }
        size++;

    }

    public void traverseLinkedList() {
        if (head != null) {
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

    public boolean searchNode(int nodeValue) {
        if (head == null) {
            System.out.println("Linked list is empty");
            return false;
        }
        Node node = head;
        for (int i = 0; i < size; i++) {
            if (node.value == nodeValue) {
                System.out.println("value found at position: " + i);
                return true;
            }
            node = node.next;
        }
        System.out.println("value not found in linked list");
        return false;
    }

    public void deleteNodeLinkedinList(int location) {
        if (head == null) {
            System.out.println("linked list does not exist");
            return;
        } else if (location == 0) {
            head = head.next;
            tail.next = head;
            size--;
            if (size == 0) {
                tail = null;
                head.next = null;
                head = null;
            }
        } else if (location >= size) {
            Node node = head;
            for (int i = 0; i < size - 1; i++) {
                node = node.next;
            }

            node.next = tail.next;
            tail = node;
        } else {
            Node node = head;
            for (int i = 0; i < location; i++) {
                node = node.next;
            }
            node.next = node.next.next;
            size--;
        }
    }


}
