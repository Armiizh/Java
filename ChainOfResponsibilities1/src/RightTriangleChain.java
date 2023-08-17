public class RightTriangleChain extends TriangleChain {

    @Override
    boolean satisfyConditions(Triangle triangle) {
        return triangle.getSide1()*triangle.getSide1()+triangle.getSide2()*triangle.getSide2()==
                        triangle.getSide3()*triangle.getSide3() ||
                triangle.getSide1()*triangle.getSide1()+triangle.getSide3()*triangle.getSide3()==
                        triangle.getSide2()*triangle.getSide2() ||
                triangle.getSide3()*triangle.getSide3()+triangle.getSide2()*triangle.getSide2()==
                        triangle.getSide1()*triangle.getSide1();
    }

    @Override
    String getTriangleType() {
        return "Прямоугольный треугольник,";
    }

    @Override
    public double calc(Triangle triangle) {
        int biggest = findMax(triangle.getSide1(),
                triangle.getSide2(), triangle.getSide3());
        double result;
        if (biggest == triangle.getSide1()) {
            result = triangle.getSide2()*triangle.getSide3();
        } else if (biggest == triangle.getSide2()) {
            result = triangle.getSide2()*triangle.getSide1();
        } else {
            result = triangle.getSide1()*triangle.getSide1();
        }
        return 0.5*result;
    }

    private int findMax(int a, int b, int c) {
        if (a>b && a>c) {
            return a;
        } else if (b>a && b>c) {
            return b;
        } else {
            return c;
        }
    }
}
