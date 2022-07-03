package tms.homework.lesson8and9.polygon;

import tms.homework.lesson8and9.GeometricFigure;

import java.util.Objects;

public abstract class Polygon extends GeometricFigure {

    protected double side1;
    protected double side2;
    protected double side3;
    protected double side4;

    public Polygon(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Polygon(double side1, double side2, double side3, double side4) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.side4 = side4;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Polygon polygon = (Polygon) o;
        return Double.compare(polygon.side1, side1) == 0 && Double.compare(polygon.side2, side2) == 0 && Double.compare(polygon.side3, side3) == 0 && Double.compare(polygon.side4, side4) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(side1, side2, side3, side4);
    }
}
