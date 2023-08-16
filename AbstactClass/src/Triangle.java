public class Triangle extends Figure {
    public Triangle(double a, double b, double c) {
        super(new double[] {a,b,c}, FigureType.TRIANGLE);
    }
    public double getArea() {
        double p = (sides[0] + sides[1] + sides[2]) / 2;
        return Math.sqrt(p * (p - sides[0]) * (p - sides[1]) * (p - sides[2]));
    }
}

