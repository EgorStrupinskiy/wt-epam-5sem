package com.egorstrupinski.wt.task3;

import java.util.Scanner;

import static java.lang.Math.tan;

public class Task3 {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        calculate(getA(), getB(), getH());
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

    private static double getA() {
        System.out.print("Введите a: ");
        double a = Double.parseDouble(sc.nextLine());
        return (a);
    }

    private static double getB() {
        System.out.print("Введите b: ");
        double b = Double.parseDouble(sc.nextLine());
        return (b);
    }

    private static double getH() {
        System.out.print("Введите h: ");
        double h = Double.parseDouble(sc.nextLine());
        return (h);
    }
}
