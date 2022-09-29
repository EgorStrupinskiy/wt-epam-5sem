package com.egorstrupinski.wt.task1_8.task3;

import static java.lang.Math.tan;

public class Task3 {

    public void calculate(double a, double b, double h) {
        double x = a;
        while (x <= b) {
            System.out.print("x = " + x + " | tg = ");
            System.out.println(tan(x));
            x += h;
        }
    }

}
