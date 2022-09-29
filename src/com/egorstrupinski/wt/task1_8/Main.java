package com.egorstrupinski.wt.task1_8;

import com.egorstrupinski.wt.task1_8.task1.Task1;
import com.egorstrupinski.wt.task1_8.task2.Task2;
import com.egorstrupinski.wt.task1_8.task3.Task3;
import com.egorstrupinski.wt.task1_8.task4.Task4;
import com.egorstrupinski.wt.task1_8.task5.Task5;
import com.egorstrupinski.wt.task1_8.task6.Task6;
import com.egorstrupinski.wt.task1_8.task7.Task7;
import com.egorstrupinski.wt.task1_8.task8.Task8;

public class Main {
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        System.out.println("Task 1:");
        System.out.println(task1.calculate(1, 2));
        System.out.println();

        Task2 task2 = new Task2();
        System.out.println("Task 2:");
        System.out.println(task2.calculate(2, 4));
        System.out.println();

        Task3 task3 = new Task3();
        System.out.println("Task 3:");
        task3.calculate(1, 8, 1);
        System.out.println();

        Task4 task4 = new Task4();
        System.out.println("Task 4:");
        task4.calculate(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        System.out.println();

        Task5 task5 = new Task5();
        System.out.println("Task 5:");
        System.out.println(task5.calculate(new int[]{1, 2 , 3, 10, 4, 5, 6}));
        System.out.println();

        Task6 task6 = new Task6();
        System.out.println("Task 6:");
        task6.calculate(new int[] {1, 2, 3, 4, 5, 6});
        System.out.println();

        Task7 task7 = new Task7();
        System.out.println("Task 7:");
        task7.calculate(new int[] {6, 5, 4, 3, 2, 1});
        System.out.println();

        Task8 task8 = new Task8();
        System.out.println("Task 8:");
        task8.calculate(new int[] {1, 2, 3, 4, 8, 10}, new int[] {3, 5, 9, 14});
        System.out.println();


    }
}
