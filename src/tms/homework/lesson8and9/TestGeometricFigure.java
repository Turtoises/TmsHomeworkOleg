package tms.homework.lesson8and9;

import tms.homework.lesson8and9.ellipse.Circle;
import tms.homework.lesson8and9.polygon.quadrangle.Parallelogram;
import tms.homework.lesson8and9.polygon.quadrangle.Rectangle;

public class TestGeometricFigure {

    public static void main(String[] args) {

        Parallelogram parallelogram = new Parallelogram(10, 15, 30);
        System.out.println(parallelogram.calculatePerimiter());
        System.out.println(parallelogram.calculateSquare());

        Circle circle=new Circle(10);
        System.out.println(circle.calculateSquare());
        System.out.println(circle.calculatePerimiter());

        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println(rectangle);

        Rectangle rectangle1=new Rectangle(5,10);
        System.out.println(rectangle.equals(rectangle1));


    }
}
