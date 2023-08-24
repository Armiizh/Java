//                 Задание
// Написать метод, который принимает 2 логических переменных isTodayFriday, aLotOfMoney, т.е.
// сегодня пятница и у вас много денег. Выведите в консоль следующее:
// если пятница и у вас много денег, то пойти в бар выпить пивка;
// если пятница, но денег нет, то попросить в долг у друга и пойти с ним попить пивка;
// во всех остальных случаях (если пятница и денег нет) пойти домой и поесть гречи.
public class Main {
    public static void main(String[] args) {
        chooseToDrink(true, true);
        chooseToDrink(true, false);
        chooseToDrink(false, true);
        chooseToDrink(false, false);
    }
    private static void chooseToDrink(boolean isToFriday, boolean aLotOfMoney) {
        if (aLotOfMoney) {
            print("I'm going to drink");
        } else if (isToFriday) {
            print("Gonna lend some money and go to drink");
        } else {
            print("Just go home and eat some food");
        }
    }
    private static void print(String result) {
        System.out.println(result);
    }
}