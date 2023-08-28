import java.util.ArrayList;
import java.util.List;

//                 Задание
// Необходимо описать работу IT команды, состоящих из Дизайнера, Программиста и Тестировщика
public class Main {
    public static void main(String[] args) {

        TaskFactory factory = new TaskFactory();
        List<Employee> employees = new ArrayList<>();
        TaskProgressCallback callback = new CallbackImpl(factory);
        employees.add(new Designer(callback, "Alicya"));
        employees.add(new Programmer((oldTask, newTask) -> System.out.println("Programmer updateTask"), "John"));
        employees.add(new Tester(callback, "Steve"));
        factory.addEmployees(employees);
        factory.start();
    }
}