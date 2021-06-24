package com.company;

import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        Queue<Integer> numbers = new PriorityQueue<>();

        numbers.offer(5);
        numbers.offer(1);
        numbers.offer(2);

        System.out.println("Queue: " + numbers);

        int accessedNumber = numbers.peek();
        System.out.println("Accessed element: " + accessedNumber);

        int removedNumber = numbers.poll();
        System.out.println("Removed element: " + removedNumber);

        System.out.println("Updated queue: " + numbers);
    }
}
