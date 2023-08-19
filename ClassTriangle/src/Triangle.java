public class Triangle {
    private final int sideA;
    private final int sideB;
    private final int sideC;

    public Triangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
    public boolean isRightTrianle() {
        return this.sideA*this.sideA+this.sideB*this.sideB == this.sideC*this.sideC ||
                this.sideA*this.sideA+this.sideC*this.sideC == this.sideB*this.sideB ||
                this.sideC*this.sideC+this.sideB*this.sideB == this.sideA*this.sideA;
    }
    public static boolean areValidArguments(int sideA, int sideB, int sideC) {
        return sideA > 0 && sideB > 0 && sideC > 0 &&
                sideA + sideB > sideC &&
                sideB + sideC > sideA &&
                sideA + sideC > sideB;
    }
}
