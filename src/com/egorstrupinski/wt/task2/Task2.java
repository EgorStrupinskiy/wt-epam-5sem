package com.egorstrupinski.wt.task2;

import java.util.Scanner;

import static java.lang.Math.abs;

public class Task2 {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(calculate(getX(), getY()));
    }

    private static boolean calculate(double x, double y) {
        if ((y > 5) || (y < -3)) {
            return false;
        } else if (y > 0) {
            if (abs(x) <= 4) {
                return true;
            }
        } else if (y <= 0) {
            if (abs(x) <= 6) {
                return true;
            }
        }
        return false;
    }

    private static double getX() {
        System.out.print("Введите x: ");
        double x = Double.parseDouble(sc.nextLine());
        return (x);
    }

    private static double getY() {
        System.out.print("Введите y: ");
        double y = Double.parseDouble(sc.nextLine());
        return (y);
    }
}
