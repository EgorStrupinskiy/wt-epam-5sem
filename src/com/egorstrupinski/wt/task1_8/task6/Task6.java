package com.egorstrupinski.wt.task1_8.task6;

public class Task6 {
    public void calculate(int[] arr) {
        int[][] ans = new int[arr.length][arr.length];
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans.length; j++) {
                ans[i][j] = arr[((i + j) % arr.length)];
            }
        }
        printArray(ans);
    }

    private void printArray(int[][] arr) {
        for (int[] row: arr
             ) {
            for (int col: row
                 ) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
