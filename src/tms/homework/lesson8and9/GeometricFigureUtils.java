package tms.homework.lesson8and9;

import tms.homework.lesson8and9.polygon.quadrangle.Rectangle;
import tms.homework.lesson8and9.polygon.triangle.Triangle;

public final class GeometricFigureUtils {

    private GeometricFigureUtils() {
    }

    public static boolean isRectangle(GeometricFigure figure) {

        return figure instanceof Rectangle;
    }

    public static boolean isTriangle(GeometricFigure figure) {

        return figure instanceof Triangle;
    }
}
