//                 Задание
// Метод принимает 3 числа на вход: стоимость пива, стоимость виски и деньги в кармане
// если денег в кармане хватает на виски то берем виски;
// если денег в кармане хватает только на пиво, то берем пиво;
// если денег в кармане хватает и на пиво и на виски, то берем и то и другое;
// но если у вас ветер в кармане - покидаем бар.
public class Main {
    private static final int Beer_cost = 5;
    private static final int Whiskey_cost = 9;
    public static void main(String[] args) {
        chooseToDrink(Beer_cost, Whiskey_cost, 15);
        chooseToDrink(Beer_cost, Whiskey_cost, 10);
        chooseToDrink(Beer_cost, Whiskey_cost, 7);
        chooseToDrink(Beer_cost, Whiskey_cost, 2);
    }
    private static void chooseToDrink(int beer_cost, int whiskey_cost, int money) {
        if (money>=beer_cost+whiskey_cost) {
            print("Whiskey and beer, please!");
        } else if (money>whiskey_cost) {
            print("Whiskey, please!");
        } else if (money>beer_cost) {
            print("Beer, please!");
        } else {
            print("Oops, seems like I have no enough money today");
        }
    }

    private static void print(String result) {
        System.out.println(result);
    }
}