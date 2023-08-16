import java.security.PublicKey;

public abstract class Figure {
    private final FigureType type;
    protected final double[] sides;
    protected Figure(double[] sides, FigureType type) {
        this.type = type;
        this.sides = sides;
    }
    public FigureType getType() {
        return type;
    }
    protected abstract double getArea();
    protected double getPerimetr() {
        double perimetr = 0;
        for (double side: sides) {
            perimetr+=side;
        }
        return perimetr;
    }
    public String toString() {
        return getType() + " - area " + getArea() +
                ", perimeter: " + getPerimetr();
    }
}
