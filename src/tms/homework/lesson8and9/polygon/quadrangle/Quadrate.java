/*
 * класс для описания квадрата
 */

package tms.homework.lesson8and9.polygon.quadrangle;

import tms.homework.lesson8and9.ellipse.Ellipse;
import tms.homework.lesson8and9.polygon.CalculateRadiusIncircle;

import java.util.Objects;

public class Quadrate extends Rectangle implements CalculateRadiusIncircle {

    public Quadrate(double side) {
        super(side, side);
    }

    @Override
    public double calculateRadiusIncircle() {

        return side1 / 2;
    }

    @Override
    public String toString() {
        return "Quadrate{" +
                "side=" + side1 +
                ", Square=" + calculateSquare() +
                ", Perimiter=" + calculatePerimiter() +
                '}';
    }

}
