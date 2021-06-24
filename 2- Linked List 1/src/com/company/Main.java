package com.company;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();

        cars.add("car1");
        cars.add("car2");
        cars.addFirst("firstCar");
        cars.addLast("lastCar");

        System.out.println("Cars is: " + cars);

        cars.removeFirst();
        cars.removeLast();

        System.out.println("Cars after removing first and last item: " + cars);

        System.out.println("Now the first item is: " + cars.getFirst());
        System.out.println("Now the last item is: " + cars.getLast());
    }
}
