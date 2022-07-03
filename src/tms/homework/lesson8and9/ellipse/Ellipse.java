package tms.homework.lesson8and9.ellipse;

import tms.homework.lesson8and9.GeometricFigure;

import java.util.Objects;

public class Ellipse extends GeometricFigure {

    protected double largeHalfAxle;
    protected double smallHalfAxle;

    public Ellipse(double largeHalfAxle, double smallHalfAxle) {

        this.largeHalfAxle = largeHalfAxle;
        this.smallHalfAxle = smallHalfAxle;
    }

    @Override
    public double calculateSquare() {
        return Math.PI * largeHalfAxle * smallHalfAxle;
    }

    @Override
    public double calculatePerimiter() {
        return 4 * (Math.PI * largeHalfAxle * smallHalfAxle + Math.pow(largeHalfAxle - smallHalfAxle, 2)) / (largeHalfAxle + smallHalfAxle);
    }

    @Override
    public String toString() {
        return "Ellipse{" +
                "largeHalfAxle=" + largeHalfAxle +
                ", smallHalfAxle=" + smallHalfAxle +
                ", Square=" + calculateSquare() +
                ", Perimiter=" + calculatePerimiter() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ellipse ellipse = (Ellipse) o;
        return Double.compare(ellipse.largeHalfAxle, largeHalfAxle) == 0 && Double.compare(ellipse.smallHalfAxle, smallHalfAxle) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(largeHalfAxle, smallHalfAxle);
    }

    public double getLargeHalfAxle() {
        return largeHalfAxle;
    }

    public void setLargeHalfAxle(double largeHalfAxle) {
        this.largeHalfAxle = largeHalfAxle;
    }

    public double getSmallHalfAxle() {
        return smallHalfAxle;
    }

    public void setSmallHalfAxle(double smallHalfAxle) {
        this.smallHalfAxle = smallHalfAxle;
    }
}
