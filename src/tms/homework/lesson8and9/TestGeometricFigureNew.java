package tms.homework.lesson8and9;

import tms.homework.lesson8and9.polygon.quadrangle.Quadrate;
import tms.homework.lesson8and9.polygon.quadrangle.Rectangle;
import tms.homework.lesson8and9.polygon.quadrangle.Rhombus;
import tms.homework.lesson8and9.polygon.triangle.Triangle;

public class TestGeometricFigureNew {

    public static void main(String[] args) {

        GeometricFigure rectangle = new Rectangle(5, 10);
        GeometricFigure quadrate = new Quadrate(10);
        System.out.println(quadrate.isEqualsSquare(rectangle));

        GeometricFigure rhombus = new Rhombus(5, 45);
        System.out.println(rhombus.calculatePerimiter());

        GeometricFigure figure = new Triangle(3, 4, 5);
        if (GeometricFigureUtils.isTriangle(figure)) {
            System.out.println(((Triangle) figure).getHightToSide1());
        } else if (GeometricFigureUtils.isRectangle(figure)) {
            System.out.println(((Rectangle) figure).calculateFirstDiagonal());
        }

    }
}
