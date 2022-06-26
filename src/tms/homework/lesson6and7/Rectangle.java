package tms.homework.lesson6and7;

public class Rectangle {

    private Point upperPoint;
    private Point lowerPoint;

    public Rectangle() {

    }

    public Rectangle(Point upperPoint, Point lowerPoint) {

        this.upperPoint = upperPoint;
        this.lowerPoint = lowerPoint;
    }

    //внутренний метод класса для получения 3-й точки для дальнейших расчетов
    private Point getThirdPoint() {

        return new Point(upperPoint.getX(), lowerPoint.getY());
    }

    public double getSquare() {

        Point thirdPoint = getThirdPoint();
        double square = thirdPoint.getDistance(upperPoint) * thirdPoint.getDistance(lowerPoint);

        return square;
    }

    public double getPerimeter() {

        Point thirdPoint = getThirdPoint();
        double perimiter = (thirdPoint.getDistance(upperPoint) + thirdPoint.getDistance(lowerPoint)) * 2;

        return perimiter;
    }

    public double getDiagonal() {

        return upperPoint.getDistance(lowerPoint);
    }

    public Point getUpperPoint() {

        return upperPoint;
    }

    public void setUpperPoint(Point upperPoint) {

        this.upperPoint = upperPoint;
    }

    public Point getLowerPoint() {

        return lowerPoint;
    }

    public void setLowerPoint(Point lowerPoint) {

        this.lowerPoint = lowerPoint;
    }

}
