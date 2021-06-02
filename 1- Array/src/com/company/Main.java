package com.company;

public class Main {

    public static void main(String[] args) {
	    String[] cars = {"Honda", "Proton"};

	    for (var car : cars)
            System.out.println(car);

	    for (int i = 0; i < cars.length; i++)
            System.out.println(cars[i]);
    }
}
