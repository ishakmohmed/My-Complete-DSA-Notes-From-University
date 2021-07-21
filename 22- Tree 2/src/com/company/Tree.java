package com.company;

class Node {
    int key;
    Node left, right;

    Node(int item) {
        key = item;
        left = right = null;
    }
}

class Tree {
    Node root;

    Tree() {
        root = null;
    }

    public void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.println(node.key);
            traverseInOrder(node.right);
        }
    }

    public void traversePostOrder(Node node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.println(node.key);
        }
    }

    public void traversePreorder(Node node) {
        if (node != null) {
            System.out.println(node.key);
            traversePreorder(node.left);
            traversePreorder(node.right);
        }
    }
}