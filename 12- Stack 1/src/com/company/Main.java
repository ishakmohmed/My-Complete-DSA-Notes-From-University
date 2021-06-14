package com.company;

public class Main {
    public static void main(String[] args) {
        StackDemo1 stack = new StackDemo1(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.pop();
        System.out.println("\nAfter popping out");

        stack.printStack();
    }
}
