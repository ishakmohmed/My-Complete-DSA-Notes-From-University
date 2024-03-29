package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[30];
        int k, num;

        System.out.println("Enter total no. of elements: ");
        num = scanner.nextInt();
        for (k = 0; k < num; k++) arr[k] = scanner.nextInt();

        shellSort(arr, num);

        System.out.println("\nSorted array is: ");
        for (k = 0; k < num; k++) System.out.println(arr[k]);
    }

    public static void shellSort(int[] arr, int num) {
        int i, j, k, tmp;

        for (i = num / 2; i > 0; i = i / 2) {
            for (j = i; j < num; j++) {
                for (k = j - 1; k >= 0; k = k - i) {
                    if (arr[k + i] > arr[k]) break;
                    else {
                        tmp = arr[k];
                        arr[k] = arr[k + i];
                        arr[k + i] = tmp;
                    }
                }
            }
        }
    }
}
