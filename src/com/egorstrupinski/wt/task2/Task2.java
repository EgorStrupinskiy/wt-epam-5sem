package com.egorstrupinski.wt.task2;

import java.util.Scanner;

import static java.lang.Math.abs;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(calculate(2, 4));
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
}
