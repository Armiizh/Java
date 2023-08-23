//                 Задание
// Написать метод, который получает на вход параметр булеан типа - сегодня выходной или нет,
// и сегодня праздник или нет. И если нам надо на работу (в выходные и праздники не надо)
// то у нас звонит будильник в 6 утра.
public class Main {
    public static void main(String[] args) {
        goToWork(true,true);
        goToWork(true,false);
        goToWork(false,true);
        goToWork(false,false);
    }
    private static void goToWork(boolean isWeekend, boolean isHoliday) {
        if (!isHoliday) {
            if (isWeekend) {
                print("Alarm on 11:00");
            } else {
                print("Alarm on 6:00! Go to work");
            }
        }
    }
    private static void print(String result) {
        System.out.println(result);
    }
}