public class Rectangle {
    private final int sideA;
    private final int sideB;
    private final int sideC;
    private final int sideD;

    public Rectangle(Points a, Points b, Points c, Points d) {
        this(a.getDistanceTo(b), b.getDistanceTo(c), c.getDistanceTo(d), a.getDistanceTo(d));
    }

    public Rectangle(int sideA, int sideB, int sideC, int sideD) {
        if (sideA > 0 && sideB > 0 && sideC > 0 && sideD>0 &&
            sideA<sideB+sideC+sideD &&
            sideB<sideA+sideC+sideD &&
            sideC<sideA+sideB+sideD &&
            sideD<sideA+sideB+sideC)
                 {
            this.sideA = sideA;
            this.sideB = sideB;
            this.sideC = sideC;
            this.sideD = sideD;
        } else {
            throw new IllegalArgumentException("Invalid arguments " + sideA + ", " + sideB + ", " + sideC + ", " + sideD);
        }
    }
    public String getDescription() {
        return isRectangleArea()
                ? "Квадрат"
                : "Обычный четырехугольник со сторонами " + sideA + ", " + sideB + ", " + sideC + ", " + sideD;
    }

    private boolean isRectangleArea() {
        return this.sideA == this.sideB && this.sideB == this.sideC && this.sideC == this.sideD;
    }


    public double Square() {
        double p = (this.sideA+this.sideB+this.sideC+sideD)/2;
        return Math.sqrt((p-this.sideA)*(p-this.sideB)*(p-this.sideC)*(p-this.sideD));
    }
}

