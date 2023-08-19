//                 Задание
// Создать класс, в котором будет проверять существования треугольника.

public class Main {
    public static void main(String[] args) {
        boolean valid = Triangle.areValidArguments(1,2,3);
        if (valid) {
            Triangle triangle = new Triangle(1,2,3);
            System.out.println(triangle.isRightTrianle());
        }
    }
}