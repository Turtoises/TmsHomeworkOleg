package tms.homework.lesson8and9.ellipse;

public class Circle extends Ellipse {

    public Circle(double radius) {

        super(radius, radius);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + largeHalfAxle +
                ", Square=" + calculateSquare() +
                ", Perimiter=" + calculatePerimiter() +
                '}';
    }


}
