//                 Задание
// Написать метод, который получает значение 3 углов. Исходя из этого проверить его тип -
// равносторонний, прямоугольный, равнобедренный, тупоугольный, остроугольный.
public class Main {
    public static void main(String[] args) {
        checkTriangleType(100,60,20);
        checkTriangleType(90,45,45);
        checkTriangleType(60,60,60);
        checkTriangleType(20,80,80);
        checkTriangleType(70,50,60);
        checkTriangleType(100,100,20);
        checkTriangleType(-1,200,0);
        checkTriangleType(60,61,20);
        } private static void checkTriangleType(int a, int b, int c) {
        String type = "";
        if (a>0 && a<180 && b>0 && b<180 && c>0 && c<180 && a+b+c==180) {
            if (a>90 || b>90 || c>90) {
                type += "Тупоугольный ";
            } if (a==b && b==c) {
                type += "Равносторонний ";
            } if (a==90 || b==90 || c==90) {
                type += "Прямоугольный ";
            } if (a==b || a==c || b==c) {
                type += "Равнобедренный ";
            } if (a<90 && b<90 && c<90) {
                type += "Остроугольный ";
            }
        } else {
            type = "Невалидный данные";
        }
        print(type);
    }
    private static void print(String result) {
        System.out.println(result);
    }
}