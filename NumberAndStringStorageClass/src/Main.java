//                     Задание
// Написать класс для хранения некоего айди числового и строки с информацией.

public class Main {
    public static void main(String[] args) {
        NumberAndString anything = new NumberAndString();
        anything.number = 2;
        anything.string = "Солнце";
        System.out.println(anything.number + "\n" + anything.string);
    }
}