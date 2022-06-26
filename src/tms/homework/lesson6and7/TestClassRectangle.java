package tms.homework.lesson6and7;

public class TestClassRectangle {

    public static void main(String[] args) {

        //создание прямоугольника по непустому конструктору
        Point upperPoint = new Point(2, 4);
        Point lowerPoint = new Point(6, 1);
        Rectangle rectangle = new Rectangle(upperPoint, lowerPoint);

        System.out.println("Diagonal=" + rectangle.getDiagonal());
        System.out.println("Square=" + rectangle.getSquare());
        System.out.println("Perimeter=" + rectangle.getPerimeter());

        //создание прямоугольника по пустому конструктору
        Rectangle rectangle1 = new Rectangle();
        rectangle1.setUpperPoint(new Point(3, 7));
        rectangle1.setLowerPoint(new Point(9, 1));

        System.out.println("Diagonal=" + rectangle1.getDiagonal());
        System.out.println("Square=" + rectangle1.getSquare());
        System.out.println("Perimeter=" + rectangle1.getPerimeter());

    }
}
