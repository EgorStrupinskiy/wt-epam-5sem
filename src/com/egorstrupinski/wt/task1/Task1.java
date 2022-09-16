package com.egorstrupinski.wt.task1;

import static java.lang.Math.abs;
import static java.lang.Math.sin;
import static java.lang.StrictMath.pow;

public class Task1 {
    public double calculate(double x, double y) {
        double numerator = (1 + pow(sin(x + y), 2));
        double denominator = 2 + abs(x - (2 * x) / (1 + pow(x, 2) * pow(y, 2)));
        double ans = 0;
        ans = numerator / denominator + x;
        return ans;
    }
}


