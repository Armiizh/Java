import java.awt.font.TextAttribute;

//                 Задание
// Написать код, который отображает вечернее обжорство какого-нибудь персонажа.
public class Main {
    public static void main(String[] args) {
        final String name = "Charlie";
        String meal = "fried chicken";
        eat(name, meal);
        meal = "potato chips";
        eat(name, meal);
    }
    private static void eat (String name, String meal) {
        System.out.println(name + "ate " + meal + " and he is happy");
    }
}