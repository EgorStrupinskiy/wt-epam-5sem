package com.egorstrupinski.wt.task1_8.task2;


import org.junit.Assert;
import org.junit.Test;

public class Task2Test {

    @Test
    public void calculate() {
        Task2 task2 = new Task2();
        Assert.assertTrue(task2.calculate(2, 4));
    }
}