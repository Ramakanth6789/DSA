package com.ram.algos.linkedlist.singly;


public class Main {
    public static void main(String[] args) {
        SinglyLinkedlist singlyLinkedlist = new SinglyLinkedlist();
        singlyLinkedlist.createSinglyLinkedList(5);
        System.out.println(singlyLinkedlist.head.value);
        singlyLinkedlist.insertInLinkedinList(6, 0);
        singlyLinkedlist.insertInLinkedinList(7, 2);
        singlyLinkedlist.insertInLinkedinList(9, 1);
        singlyLinkedlist.insertInLinkedinList(99, 2);
        System.out.println(singlyLinkedlist.head.value);
        System.out.println(singlyLinkedlist.tail.value);
        System.out.println("-------------------");
        singlyLinkedlist.traversalLinkedinList();
        System.out.println("------");
        System.out.println(singlyLinkedlist.searchValue(99));
        System.out.println("-------------------");
        singlyLinkedlist.deleteNode(3);
        singlyLinkedlist.traversalLinkedinList();


    }
}
