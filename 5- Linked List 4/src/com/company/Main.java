package com.company;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
	    HashSet<String> cars = new HashSet<String>();
	    cars.add("car1");
	    cars.add("car2");

        System.out.println("cars: " + cars);
        System.out.println("cars size: " + cars.size());

        for (var i : cars)
            System.out.println(i);

        cars.remove("car1");
        System.out.println("cars after car1 removed: " + cars);
        System.out.println("cars size: " + cars.size());

        cars.clear();

        System.out.println(cars.contains("car1"));
        System.out.println(cars.contains("car2"));
    }
}
