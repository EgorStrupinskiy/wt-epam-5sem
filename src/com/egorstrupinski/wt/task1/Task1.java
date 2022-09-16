package com.egorstrupinski.wt.task1;

import java.util.Scanner;

import static java.lang.Math.*;

public class Task1 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(calculate(1, 2));
    }

    private static double calculate(double x, double y) {
        double numerator = (1 + pow(sin(x + y), 2));
        double denominator = 2 + abs(x - (2 * x) / (1 + pow(x, 2) * pow(y, 2)));
        double ans = 0;
        ans = numerator / denominator + x;
        return ans;
    }

}


