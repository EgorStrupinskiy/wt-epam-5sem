package com.egorstrupinski.wt.task9_15;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private List<Ball> ballsInside;

    public List<Ball> getBallsInside() {
        return ballsInside;
    }

    public Basket() {
        this.ballsInside = new ArrayList<>();
    }

    public void setBallsInside(List<Ball> ballsInside) {
        this.ballsInside = ballsInside;
    }

    public void addBallInside(Ball ball) {
        this.ballsInside.add(ball);
    }

    public int findWeight() {
        int weight = 0;
        for (Ball ball : ballsInside
        ) {
            weight += ball.getWeight();
        }
        return weight;
    }

    public int findBlueBallsAmount(){
        int amount = 0;
        for (Ball ball : ballsInside
        ) {
            if (ball.getColor() == "blue") {
                amount++;
            }
        }
        return amount;
    }
}
