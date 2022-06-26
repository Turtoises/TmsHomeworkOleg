package tms.homework.lesson6and7;

import java.lang.Math;

public class Point {

    private double x;
    private double y;

    public Point(double x, double y) {

        this.x = x;
        this.y = y;
    }

    public double getDistance(Point point) {

        double distance = Math.hypot(x - point.getX(), y - point.getY());

        return distance;
    }

    public double getX() {

        return x;
    }

    public void setX(double x) {

        this.x = x;
    }

    public double getY() {

        return y;
    }

    public void setY(double y) {

        this.y = y;
    }

}



