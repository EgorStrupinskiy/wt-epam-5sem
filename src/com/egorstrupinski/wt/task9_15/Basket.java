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

    public long findWeight() {
        int weight = 0;
        return ballsInside.stream().reduce(
                0,
                (x, y) -> x + y.getWeight(),
                Integer::sum
        );
    }

    public long findBlueBallsAmount() {
        return ballsInside.stream().filter((ball) -> ball.getColor().equals("blue")).count();
    }
}
