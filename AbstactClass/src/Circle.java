public class Circle extends Figure {
    public Circle(double radius) {
        super(new double[] {radius}, FigureType.CIRCLE);
    }
    public double getPerimetr() {
        return 2*3.14*sides[0];
    }
    public double getArea() {
        return 3.14 * sides[0] * sides[0];
    }
}
