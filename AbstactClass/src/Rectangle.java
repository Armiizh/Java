public class Rectangle extends Figure {
    public Rectangle(double a, double b) {
        super(new double[] {a, b}, FigureType.RECTANGLE);
    }
    protected double getPerimetr() {
        return 2*super.getPerimetr();
    }
    protected double getArea() {
        return sides[0]*sides[1];
    }
    public String toString() {
        return "Прямоугольник " + "площадь: " + getArea();
    }
}
