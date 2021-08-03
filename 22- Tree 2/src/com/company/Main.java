package com.company;

public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);

        System.out.println("Preorder Traversal: ");
        tree.traversePreOrder(tree.root);

        System.out.println("Inorder Traversal: ");
        tree.traverseInOrder(tree.root);

        System.out.println("Postorder Traversal: ");
        tree.traversePostOrder(tree.root);
    }
}
