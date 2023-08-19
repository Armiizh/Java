import java.util.Scanner;

//                      Задание
//Пишем полноценного бота, который имеет какое-то количество команд
//и может выдать какую-то информацию по ним. На любой вид, который
//не попадает под команды выдаём список возможных команд с
//предложением - извините, но такой команды нет. Вот список того,
//что вы можете узнать. Добавить команду выхода и при её вводе
//выйти из программы.
public class Main {

    private static final String[] COMMANDS = new String[] {
            "/help", "/start", "/end", "/getlocation"
    };
    private static final String[] RESULTS = new String[]{
            "", "Bot started...", "Bot ended", "location is Moscow"
    };
    public static void main(String[] args) {
        CommanAndResult commanAndResult = new CommanAndResult("my command", "my result");
    }
    private static void print(Object result) {
        System.out.println(result);
    }
}