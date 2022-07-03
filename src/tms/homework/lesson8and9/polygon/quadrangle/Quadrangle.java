/*
 * класс для описания выпуклого четырехугольника общего вида
 */

package tms.homework.lesson8and9.polygon.quadrangle;

import tms.homework.lesson8and9.polygon.Polygon;

import java.util.Objects;

import static java.lang.Math.*;

public class Quadrangle extends Polygon implements CalculateQuadrangle {

    protected double leftDownCorner;
    protected double rightUpCorner;

    protected static final double RECTANGLE_CORNER = 90;
    protected static final double SQUARE_CORNER = 90;

    public Quadrangle(double leftSide, double rightSide, double upSide, double downSide, double leftDownCorner, double rightUpCorner) {
        super(leftSide, rightSide, upSide, downSide);
        this.leftDownCorner = leftDownCorner;
        this.rightUpCorner = rightUpCorner;
    }

    @Override
    public double calculateSquare() {

        return side1 * side4 * sin(toRadians(leftDownCorner)) / 2 + side2 * side3 * sin(toRadians(rightUpCorner)) / 2;
    }

    @Override
    public double calculatePerimiter() {

        return (side1 + side2 + side3 + side4);
    }

    @Override
    public double calculateFirstDiagonal() {

        return sqrt(pow(side1, 2) + pow(side4, 2) - 2 * side1 * side4 * cos(toRadians(leftDownCorner)));
    }

    @Override
    public double calculateSecondDiagonal() {

        double diagonal = calculateFirstDiagonal();
        double leftUpCornerPart1 = acos((pow(diagonal, 2) + pow(side1, 2) - pow(side4, 2)) / 2 / diagonal / side1);
        double leftUpCornerPart2 = acos((pow(diagonal, 2) + pow(side3, 2) - pow(side2, 2)) / 2 / diagonal / side3);

        return sqrt(pow(side1, 2) + pow(side4, 2) - 2 * side1 * side4 * cos(leftUpCornerPart1 + leftUpCornerPart2));
    }

    @Override
    public String toString() {
        return "Quadrangle{" +
                "leftDownCorner=" + leftDownCorner +
                ", rightUpCorner=" + rightUpCorner +
                ", leftSide=" + side1 +
                ", rightSide=" + side2 +
                ", upSide=" + side3 +
                ", downSide=" + side4 +
                ", Square=" + calculateSquare() +
                ", Perimiter=" + calculatePerimiter() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Quadrangle that = (Quadrangle) o;
        return Double.compare(that.leftDownCorner, leftDownCorner) == 0 && Double.compare(that.rightUpCorner, rightUpCorner) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), leftDownCorner, rightUpCorner);
    }

    public double getLeftSide() {
        return side1;
    }

    public void setLeftSide(double side1) {
        this.side1 = side1;
    }

    public double getRightSide() {
        return side2;
    }

    public void setRightSide(double side2) {
        this.side2 = side2;
    }

    public double getUpSide() {
        return side3;
    }

    public void setUpSide(double side3) {
        this.side3 = side3;
    }

    public double getDownSide() {
        return side4;
    }

    public void setDownSide(double side4) {
        this.side4 = side4;
    }

    public double getLeftDownCorner() {
        return leftDownCorner;
    }

    public void setLeftDownCorner(double leftDownCorner) {
        this.leftDownCorner = leftDownCorner;
    }

    public double getRightUpCorner() {
        return rightUpCorner;
    }

    public void setRightUpCorner(double rightUpCorner) {
        this.rightUpCorner = rightUpCorner;
    }
}
