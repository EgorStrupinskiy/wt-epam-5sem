package com.egorstrupinski.wt.task4;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Task4 {

    public static void main(String[] args) {
        calculate(new int[] {1,2,3,4,5,6,7,8,9});
    }

    private static void calculate(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (findIfSimple(arr[i])) {
                System.out.println(i);
            }
        }
    }

    private static boolean findIfSimple(int num) {
        if (num > 2) {
            for (int j = 2; j <= sqrt(num); j++) {
                if (num % j == 0) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
