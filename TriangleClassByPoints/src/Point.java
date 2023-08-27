public class Point {
    private final int x;
    private final int y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getDistanceTo(Point other) {
        return (int) Math.sqrt((x - other.x)*(x-other.x)+(y-other.y)*(y-other.y));
    }
}
