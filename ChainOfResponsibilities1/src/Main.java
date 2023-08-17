//                 Задание
// Написать класс треугольника, к нему написать цепочку с 1 методом в интерфейсе –
// рассчитать площадь. Первое звено – если треугольник равносторонний то вычисляется
// через формулу (а^2 * Math.sqrt(3))/4. Если нет, то отдаем другому звену.
// Второе звено для равнобедренного треугольника, сначала находим высоту через теорему Пифагора,
// после уже берем произведение половины стороны и высоты (0.5*a*b). Далее заново для прямоугольного
// треугольника – там просто половина произведения катетов. Ну и последнее звено общая формула.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Дать доступ к сторонам треугольника через геттеры для этой задачи, чтобы не хранить методы определения
// типа треугольника. Или же написать метод определения типа треугольника в классе треугольника который вернет enum
// и используйте его, а поля класса сделать приватными.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Triangle> triangleList = new ArrayList<>();
        triangleList.add(new Triangle(scanner.nextInt(),scanner.nextInt(),scanner.nextInt()));
        triangleList.add(new Triangle(4,6,6));
        triangleList.add(new Triangle(3,4,5));
        triangleList.add(new Triangle(4,5,6));
        triangleList.add(new Triangle(4,1,4));
        TriangleChain chain0 = new EquiliteralTriangleChain();
        TriangleChain chain1 = new IsoScelesTriangleChain();
        TriangleChain chain2 = new RightTriangleChain();
        TriangleChain chain3 = new BaseTriangleChain();
        chain2.setNext(chain3);
        chain1.setNext(chain2);
        chain0.setNext(chain1);

        for (Triangle triangle : triangleList)
            System.out.println(chain0.getSquare(triangle));
    }
}