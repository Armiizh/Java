import java.util.Enumeration;
import java.util.Scanner;

//                      Задание
//В консоль вводят 10 чисел последовательно. Проверить, что они являются
//арифмитической последовательностью. Выдать, что это не последовательность сразу же,
//как только вводится неверное число.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        print("Введите первое число арифметической последовательности");
        int[] array = new int[10];
        int step1=0;
        int step2=0;
        for (int i=0; i<array.length; i++) {
            array[i] = scanner.nextInt();
            if (i==1) {
                step1=array[i]-array[i-1];
            } else if (i>1 && i<array.length) {
                step2=array[i]-array[i-1];

            }
            if (i>1 && i<array.length) {
                if (step1!=step2) {
                    print("Это не последовательность");
                    return;
                }
            }
        }
    }
    public static void print (String result){
        System.out.println(result);
    }
}