package com.egorstrupinski.wt.task4;

import static java.lang.Math.sqrt;

public class Task4 {
    public void calculate(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (findIfSimple(arr[i])) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    private boolean findIfSimple(int num) {
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
