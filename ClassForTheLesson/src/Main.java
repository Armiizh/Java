//                 Задание
// Написать класс для урока, в нем должен быть номер урока и флаг - завершен или нет.

public class Main {
    public static void main(String[] args) {
       Lesson lesson1 = new Lesson();
       lesson1.NumberOfLesson = 1;
       lesson1.NameOfLesson = "Физика";
       lesson1.Progress = true;
       print("Урок " + lesson1.NameOfLesson + " под номером " + lesson1.NumberOfLesson);
       Lesson lesson2 = new Lesson();
       lesson2.NumberOfLesson = 2;
       lesson2.NameOfLesson = "Физ-ра";
        print("Урок " + lesson2.NameOfLesson + " под номером " + lesson2.NumberOfLesson);
       if (lesson1.Progress == true) {
           print("Урок " + lesson1.NameOfLesson + " под номером " + lesson1.NumberOfLesson + " еще не закончился");
       }
    }
    public static void print(String result) {
        System.out.println(result);
    }
}