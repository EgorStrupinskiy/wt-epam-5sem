package com.egorstrupinski.wt.task7;

public class Task7 {
    public void calculate(int[] arr) {
        int n = arr.length;
        for (int temp = n / 2; temp > 0; temp /= 2) {
            for (int i = temp; i < n; i += 1) {
                int x = arr[i];
                int j;
                for (j = i; j >= temp && arr[j - temp] > x; j -= temp) {
                    arr[j] = arr[j - temp];
                }
                arr[j] = x;
            }
        }
        printArray(arr);
    }

    private void printArray(int[] arr) {
        for (int el : arr
        ) {
            System.out.print(el + " ");
        }
        System.out.println();
    }
}
