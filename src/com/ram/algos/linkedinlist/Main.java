package com.ram.algos.linkedinlist;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedlist singlyLinkedlist = new SinglyLinkedlist();
        singlyLinkedlist.createSinglyLinkedList(5);
        System.out.println(singlyLinkedlist.head.value);
    }
}
