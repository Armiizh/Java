public class Triangle {

    private final int ab;
    private final int bc;
    private final int cd;

    public Triangle(int ab, int bc, int cd) {
        this.ab = ab;
        this.bc = bc;
        this.cd = cd;
    }

    public int getSide1() {
        return ab;
    }

    public int getSide2() {
        return bc;
    }

    public int getSide3() {
        return cd;
    }
}
