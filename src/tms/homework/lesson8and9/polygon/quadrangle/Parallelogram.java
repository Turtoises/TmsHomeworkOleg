/*
 * класс для описания параллелограмма
 */

package tms.homework.lesson8and9.polygon.quadrangle;

public class Parallelogram extends Quadrangle {

    public Parallelogram(double leftSmallSide, double downLargeSide, double leftDownCorner) {
        super(leftSmallSide, leftSmallSide, downLargeSide, downLargeSide, leftDownCorner, leftDownCorner);
    }

    @Override
    public String toString() {
        return "Parallelogram{" +
                "leftDownCorner=" + leftDownCorner +
                ", leftSide=" + side1 +
                ", downSide=" + side3 +
                ", Square=" + calculateSquare() +
                ", Perimiter=" + calculatePerimiter() +
                '}';
    }

}
