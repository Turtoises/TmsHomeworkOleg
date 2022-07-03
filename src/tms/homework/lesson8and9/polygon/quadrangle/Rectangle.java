/*
 * класс для описания прямоугольника
 */

package tms.homework.lesson8and9.polygon.quadrangle;

import java.util.Objects;

public class Rectangle extends Parallelogram {

    public Rectangle(double smallSide, double largeSide) {
        super(smallSide, largeSide, RECTANGLE_CORNER);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "smallSide=" + side1 +
                ", largeSide=" + side3 +
                ", Square=" + calculateSquare() +
                ", Perimiter=" + calculatePerimiter() +
                '}';
    }

}
