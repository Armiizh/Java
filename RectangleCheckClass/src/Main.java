//                 Задание
// Написать класс для прямоугольника который получает 4 стороны.
// Добавочный метод является ли он квадратом
public class Main {
    public static void main(String[] args) {
        boolean valid = Rectangle.areValidArguments(2,2,2,2);
        if (valid) {
            Rectangle rectangle = new Rectangle(2,2,2,2);
            System.out.println(rectangle.isRectangleSquare());
        }
    }
}