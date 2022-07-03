/*
 * класс для описания треугольника
 */

package tms.homework.lesson8and9.polygon.triangle;

import tms.homework.lesson8and9.polygon.CalculateRadiusIncircle;
import tms.homework.lesson8and9.polygon.Polygon;

public class Triangle extends Polygon implements CalculateRadiusIncircle {

    public Triangle(double smallSide, double middleSide, double largeSide) {

        super(smallSide, middleSide, largeSide);
    }

    @Override
    public double calculateSquare() {
        double p = calculatePerimiter() / 2;

        return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                ", Square=" + calculateSquare() +
                ", Perimiter=" + calculatePerimiter() +
                '}';
    }

    @Override
    public double calculatePerimiter() {

        return side1 + side2 + side3;
    }

    public double getHightToSide1() {

        return 2 * calculateSquare() / side1;
    }

    public double getHightToSide2() {

        return 2 * calculateSquare() / side2;
    }

    public double getHightToSide3() {

        return 2 * calculateSquare() / side3;
    }

    @Override
    public double calculateRadiusIncircle() {
        return 2 * calculateSquare() / calculatePerimiter();
    }
}
