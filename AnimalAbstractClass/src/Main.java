//                 Задание
// Написать абстрактный класс для животного и наследники типа: Собака, Утка и Рыба.
// Для каждого вида сделать переопределяемый метод движения и поле "кличка".
// Написать внятное описание для каждого объекта и в цикле вывести мейне.
public class Main {
    public static void main(String[] args) {
        Animals[] animals = new Animals[3];
        animals[0] = new Dog();
        animals[1] = new Duck();
        animals[2] = new Fish();
        for (Animals animal : animals) {
            print(animal.toString());
        }
    }
    private static void print(String result) {
        System.out.println(result);
    }
}