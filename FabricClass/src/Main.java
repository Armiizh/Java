//                 Задание
// Написать фабрику разработчиков. У вас должен быть абстрактный работник с зарплатой и опытом
// и 3 уровня работников - Junior, Middle, Senior реализации. Написать фабрику в которой определить
// по опыту или зарплате какой нужно предоставить объект работника.
public class Main {
    public static void main(String[] args) {
        WorkerFactory factory = new WorkerFactory();
        print(
                factory.create(1000, 1),
                factory.create(3000, 3),
                factory.create(6000, 6)
        );
    }
    private static void print(Worker... workers) {
        for (Worker worker: workers) {
            print((worker.toString()));
        }
    }
    private static void print(String result) {
        System.out.println(result);
    }
}