package com.egorstrupinski.wt.task9_15;

public class Ball {
    private int weight;
    private String color;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Ball(int weight, String color) {
        this.weight = weight;
        this.color = color;
    }
}
