package com.company;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Integer> numbers = new PriorityQueue<>();

        numbers.add(4);
        numbers.add(2);
        System.out.println("PriorityQueue: " + numbers);

        numbers.offer(1);
        System.out.println("Updated PriorityQueue: " + numbers);
    }
}
