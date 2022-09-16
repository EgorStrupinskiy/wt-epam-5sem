package com.egorstrupinski.wt.task3;

import java.util.Scanner;

import static java.lang.Math.tan;

public class Task3 {
    public static void main(String[] args) {
        calculate(1, 8 ,1);
    }

    private static void calculate(double a, double b, double h) {
        double x = a;
        while (x <= b) {
            System.out.print("x = " + x + " | ");
            System.out.println(tan(x));
            x += h;
        }
        System.out.println(x);
    }

}
