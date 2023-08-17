public class BaseTriangleChain extends TriangleChain {

    @Override
    boolean satisfyConditions(Triangle triangle) {
        return triangle.getSide1()>0 && triangle.getSide2()>0 && triangle.getSide3()>0 &&
                triangle.getSide1()+triangle.getSide2()> triangle.getSide3() &&
                triangle.getSide3()+triangle.getSide2()> triangle.getSide1() &&
                triangle.getSide1()+triangle.getSide3()> triangle.getSide2();
    }

    @Override
    String getTriangleType() {
        return "Обычный треугольник,";
    }

    @Override
    public double calc(Triangle triangle) {
        int half = (triangle.getSide1()+triangle.getSide2()+triangle.getSide3())/2;
        return Math.sqrt(half*(half-triangle.getSide1())*(half-triangle.getSide2())*(half-triangle.getSide3()));
    }
}
