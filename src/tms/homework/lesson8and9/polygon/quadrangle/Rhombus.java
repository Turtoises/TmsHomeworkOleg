/*
 * класс для описания ромба
 */

package tms.homework.lesson8and9.polygon.quadrangle;

import tms.homework.lesson8and9.polygon.CalculateRadiusIncircle;

public class Rhombus extends Parallelogram implements CalculateRadiusIncircle {

    public Rhombus(double side, double leftDownCorner) {

        super(side, side, leftDownCorner);
    }

    @Override
    public double calculateRadiusIncircle() {
        return side1 * Math.sin(Math.toRadians(leftDownCorner)) / 2;
    }

    @Override
    public String toString() {
        return "Rhombus{" +
                "leftDownCorner=" + leftDownCorner +
                ", side1=" + side1 +
                ", Square=" + calculateSquare() +
                ", Perimiter=" + calculatePerimiter() +
                '}';
    }

}
