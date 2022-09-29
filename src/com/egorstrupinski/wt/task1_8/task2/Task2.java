package com.egorstrupinski.wt.task1_8.task2;

import static java.lang.Math.abs;

public class Task2 {
    public boolean calculate(double x, double y) {
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
