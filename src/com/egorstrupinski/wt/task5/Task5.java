package com.egorstrupinski.wt.task5;

public class Task5 {
    public int calculate(int[] arr) {
        int num = arr[0];
        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > num) {
                num = arr[i];
            } else {
                count++;
            }
        }
        return count;
    }
}
