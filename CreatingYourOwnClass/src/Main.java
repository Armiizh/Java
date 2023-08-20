//                           Задание
// Написать класс Личности, в нем должны быть поля имени и фамилии как минимум,
// остальное на ваше усмотрение.

public class Main {
    public static void main(String[] args) {
        Person anything = new Person();
        anything.gender = "Мужской";
        anything.name = "Олег";
        anything.lastname = "Сосулькин";
        anything.middlename = "Петрович";
        anything.age = "40";
        anything.height = "180";
        anything.weight = "80";
        System.out.println(anything.gender + "\n" + anything.name + "\n" + anything.lastname + "\n" +
                anything.middlename + "\n" + anything.age + "\n" + anything.height + "\n" + anything.weight);
    }
}