//                 Задание
// Написать метод, который получает на вход 3 числа и проверят - существует ли такой
// треугольник или нет (он существует если сумма любых 2 сторон больше третьей)
public class Main {
    public static void main(String[] args) {
        print(Triangle(3,4,5));
        print(Triangle(1,2,3));
        print(Triangle(0,2,3));
        print(Triangle(3,-2,5));
    }
    private static boolean Triangle(int a, int b, int c) {
        return a>0 && b>0 && c>0 &&
                a+b>c && a+c>b && b+c>a;
    }
    private static void print(boolean result) {
        System.out.println(result);
    }
}