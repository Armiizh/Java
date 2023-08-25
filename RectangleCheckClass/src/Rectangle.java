public class Rectangle {
    private final int sideA;
    private final int sideB;
    private final int sideC;
    private final int sideD;
    public Rectangle(int sideA, int sideB, int sideC, int sideD) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.sideD = sideD;
    }
    public boolean isRectangleSquare() {
        return this.sideA==this.sideB && this.sideC==this.sideD &&
                this.sideA==this.sideC;
    }
    public static boolean areValidArguments(int sideA, int sideB, int sideC, int sideD) {
        return sideA==sideB && sideC==sideD ||
                sideA==sideC && sideB==sideD ||
                sideA==sideD && sideB==sideC;
    }

}
