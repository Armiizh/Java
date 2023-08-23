import java.util.Objects;

//                 Задание
// Написать метод, который принимает на вход 4 числа и отображает наименьшее из них.
public class Main {
    public static void main(String[] args) {
        print(min(1,2,3,4));
        print(min(-5,-20,0,9));
    }
    private static int min(int a, int b, int c, int d) {
        int minAB = min(a,b);
        int minCD = min(c,d);
        return min(minAB,minCD);
    }
    private static int min(int a, int b) {
        return a<b?a:b;
    }
    private static void print(int result) {
        System.out.println(result);
    }
}

//Так же можно написать не использую другую функцию
    /*private static int min(int a, int b, int c, int d) {
    int min = a;
    if (b<min) {
        min=b;
    } if (c<min) {
        min=c;
        } if (d<min) {
        min=d;
        } return min;
    }
     */