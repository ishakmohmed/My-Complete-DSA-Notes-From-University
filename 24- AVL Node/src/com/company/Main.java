package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        AVLTree avlt = new AVLTree();

        System.out.println("AVLTree Tree Test\n");

        char ch;

        do {
            System.out.println("\nAVLTree Operations\n");
            System.out.println("1. insert");
            System.out.println("2. search");
            System.out.println("3. count nodes");
            System.out.println("4. check empty");
            System.out.println("5. clear tree");

            int choice = scan.nextInt();

            switch(choice) {
                case 1:
                    System.out.println("Enter integer element to insert: ");
                    avlt.insert(scan.nextInt());
                    break;

                case 2:
                    System.out.println("Enter integer element to search: ");
                    System.out.println("Search result: " + avlt.search(scan.nextInt()));
                    break;

                case 3:
                    System.out.println("Nodes = " + avlt.countNodes());
                    break;

                case 4:
                    System.out.println("Empty status = " + avlt.isEmpty());
                    break;

                case 5:
                    System.out.println("\nTree Cleared!\n");
                    avlt.makeEmpty();
                    break;

                default:
                    System.out.println("\nWrong Entry!\n");
                    break;
            }

            System.out.print("\nPostorder: ");
            avlt.postorder();
            System.out.print("\nPreorder: ");
            avlt.preorder();
            System.out.print("\nInorder: ");
            avlt.inorder();
            System.out.println("\nDo you want to continue? (y or n):\n");

            ch = scan.next().charAt(0);
        } while (ch == 'Y' || ch == 'y');
    }
}