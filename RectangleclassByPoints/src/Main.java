//                 Задание
// Написать класс, который будет внутри метода рассчитывать расстояние между точками
// и определять создают ли три эти точки треугольник с определенными сторонами
public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(
                new Points(1,1),
                new Points(1,4),
                new Points(4,1),
                new Points(4,4)
        );
        System.out.println(rectangle.getDescription());
        System.out.println("Площадь: " + rectangle.Square());
    }
}