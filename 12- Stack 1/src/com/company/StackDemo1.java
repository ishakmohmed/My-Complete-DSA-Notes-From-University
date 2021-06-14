package com.company;

public class StackDemo1 {
    private final int arr[];
    private int top;
    private final int capacity;

    StackDemo1(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    public  void push(int x) {
        if (isFull()) {
            System.out.println("OverFlow\nProgram Terminated\n");
            System.exit(1);
        }

        System.out.println("Inserting: " + x);
        arr[++top] = x;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("STACK EMPTY");
            System.exit(1);
        }
        return arr[top--];
    }

    public int size() {
        return top + 1;
    }

    public boolean isEmpty() {
        return top == 1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public void printStack() {
        for (int i = 0; i <= top; i++) {
            System.out.println(arr[i]);
        }
    }
}
