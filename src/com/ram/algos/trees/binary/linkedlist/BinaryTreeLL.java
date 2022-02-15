package com.ram.algos.trees.binary.linkedlist;

import java.util.*;

public class BinaryTreeLL {
    BinaryNode root;

    public BinaryTreeLL() {
        this.root = null;

    }

    public void preOrder(BinaryNode node) {
        if (node == null) {
            return;
        }
        System.out.print(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void inOrder(BinaryNode node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);

        System.out.print(node.value + " ");
        inOrder(node.right);
    }

    public void postOrder(BinaryNode node) {
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + " ");
    }

    public void levelOrder(BinaryNode node) {
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();
            System.out.println(presentNode.value + " ");
            if (presentNode.left != null) {
                queue.add(presentNode.left);
            }
            if (presentNode.right != null) {
                queue.add(presentNode.right);
            }

        }
    }

    public void searchMethod(String value) {
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();
            if (presentNode.value == value) {
                System.out.println("The value " + value + " is found in the tree");
                return;
            } else {
                if (presentNode.left != null) {
                    queue.add(presentNode.left);
                }
                if (presentNode.right != null) {
                    queue.add(presentNode.right);
                }
            }

        }
        System.out.println("The value " + value + " is not found in the tree");
    }

    public void insertMethod(String value){
        BinaryNode node = new BinaryNode();
        node.value = value;
        if (root == null) {
            root = node;
            System.out.println("Inserted new node at root");
            return;
        }

        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();
            if (presentNode.left == null) {
                presentNode.left = node;
                System.out.println("Node inserted in left");
                break;
            } else if (presentNode.right == null) {
                presentNode.right = node;
                System.out.println("Node inserted in right");
                break;
            }else{
                queue.add(presentNode.left);
                queue.add(presentNode.right);
            }
        }

    }

    public BinaryNode getDeepestNode(){
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        BinaryNode presentNode = null;
        while(!queue.isEmpty()){
            presentNode = queue.remove();
            if (presentNode.left != null) {
                queue.add(presentNode.left);
            }
            if (presentNode.right != null) {
                queue.add(presentNode.right);
            }

        }
        return presentNode;
    }
}
