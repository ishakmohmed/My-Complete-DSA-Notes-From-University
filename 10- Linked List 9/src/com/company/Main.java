package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(55);
        list.add(66);
        list.add(77);
        list.add(88);

        System.out.println("Before: LinkedList: " + list);

        List<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        list.addAll(arrayList);

        System.out.println("After: LinkedList: " + list);
    }
 }
