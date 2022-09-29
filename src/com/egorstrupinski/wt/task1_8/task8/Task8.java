package com.egorstrupinski.wt.task1_8.task8;

public class Task8 {
    public void calculate(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];
        int num1 = 0;
        int num2 = 0;
        for (int i = 0; i < arr3.length; i++) {
            if (arr1[num1] < arr2[num2]) {
                arr3[i] = arr1[num1];
                num1++;

            } else if (arr2[num2] < arr1[num1]) {
                arr3[i] = arr2[num2];
                num2++;
            } else if (arr2[num2] == arr1[num1])
                if (num1 < num2
                ) {
                    arr3[i] = arr1[num1];
                    num1++;
                } else {
                    arr3[i] = arr2[num2];
                    num2++;
                }
        }
        printArray(arr3);
    }

    private void printArray(int[] arr) {
        for (int el : arr
        ) {
            System.out.print(el + " ");
        }
        System.out.println();
    }
}
