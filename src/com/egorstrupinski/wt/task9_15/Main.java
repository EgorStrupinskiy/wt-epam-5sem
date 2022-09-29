package com.egorstrupinski.wt.task9_15;

public class Main {
    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.addBallInside(new Ball(2, "blue"));
        basket.addBallInside(new Ball(3, "red"));
        basket.addBallInside(new Ball(4, "blue"));
        basket.addBallInside(new Ball(5, "green"));

        System.out.println(basket.findWeight());
        System.out.println(basket.findBlueBallsAmount());
    }
}
