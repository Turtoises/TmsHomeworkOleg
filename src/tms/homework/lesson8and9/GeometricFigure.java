package tms.homework.lesson8and9;

public abstract class GeometricFigure implements –°alculateFigure {

    public boolean isEqualsSquare(GeometricFigure otherFigure) {

        return this.calculateSquare() == otherFigure.calculateSquare();
    }


}
