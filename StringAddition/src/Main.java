import java.lang.invoke.StringConcatException;

//                 Задание
// Написать метод, который берет две строки и складывает их.
// Между ними добавляет символ переноса строки.
public class Main {
    public static void main(String[] args) {
        String first = "Hello World!";
        String second = "Это моя первая программа на Джава";
        String result = concat(first, second);
        print(result);
    }
    private static String concat(String str1, String str2) {
        return str1+"\n"+str2;
    }
    private static void print(String result) {
        System.out.println(result);
    }
}