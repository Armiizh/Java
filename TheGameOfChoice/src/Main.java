import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//                 Задание
// Написать имитацию игры, где звенья цепи будут уровни. Игра типа квест. У каждого звена/уровня
// будет свой вопрос или несколько вопросов с какими-то верными ответами или же любой ответ
// будет допустим, но из списка предложенных. Все ответы нужно хранить в каком-то классе,
// можно в списке/массиве. Самое интересное будет то, что следующая цепочка будет проверять повторно
// ответ предыдущей цепи и исходя из этого задавать нужный вопрос. Как в сценарии. Каждый уровень
// зависит от итога предыдущего, и сценарий будет свой.
public class Main {
    public static void main(String[] args) {
        print("Привет, это игра квест, давай попробуем сыграть)" + "\n\n" +
                "Перед тобой развилка:" +"\n"+
                "налево пойдешь Оленя встретишь;" +"\n"+
                "направо пойдешь Кабана встретишь;" +"\n"+
                "направо пойдешь Осла встретишь;" +"\n"+
                "Напиши куда собрался");
        Scanner scanner = new Scanner(System.in);
        List<String> choices = new ArrayList<>();
        choices.add(new String(String.valueOf(scanner.nextInt())));
       // int zp = scanner.nextInt();
        print("Привет");

    }

    private static void print(String result) {
        System.out.println(result);
    }
}
//* Scanner scanner = new Scanner(System.in);
//
//        print("Введите вашу заработную плату");
//        int zp = scanner.nextInt();