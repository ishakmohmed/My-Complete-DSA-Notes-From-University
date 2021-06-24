package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<Integer>();

        q1.add(10);
        q1.add(20);
        q1.add(30);
        q1.add(40);
        q1.add(50);

        System.out.println("Elements in queue: " + q1);
        System.out.println("Element removed from the queue: " + q1.remove());
        System.out.println("Head of the queue: " + q1.poll());
        System.out.println("poll() returned head of the queue: " + q1.poll());
        System.out.println("peek() head of the queue: " + q1.peek());
        System.out.println("Final queue: " + q1);
    }
}
