public class Points {
    private final int x;
    private final int y;

    public Points(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getDistanceTo(Points other) {
        return (int) Math.sqrt((x - other.x) * (x - other.x) + (y - other.y) * (y - other.y));
    }
}
