public abstract class TriangleChain implements Square {

    private TriangleChain next;

    public void setNext(TriangleChain next) {
        this.next = next;
    }

    public double getSquare(Triangle triangle) {
        if (satisfyConditions(triangle)) {
            System.out.println("Тип треугольника: " + getTriangleType());
            System.out.print("площадь которого равна ");
            return calc(triangle);
        } else if (next != null) {
            return next.getSquare(triangle);
        } else
            throw new IllegalArgumentException("Площадь не была посчитана");
    }

    abstract boolean satisfyConditions(Triangle triangle);
    abstract String getTriangleType();
}
