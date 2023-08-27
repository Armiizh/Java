//                 Задание
// Написать класс, который будет внутри метода рассчитывать расстояние между точками
// и определять создают ли три эти точки треугольник с определенными сторонами
public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(
                new Point(1,3),
                new Point(4,0),
                new Point(0,0)
        );
        System.out.println(triangle.getDescription());
    }
}