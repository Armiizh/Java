//                 Задание
// Написать метод, который будет проверять делитель на ноль и в этом случае ничего не делал.
public class Main {
    public static void main(String[] args) {
        showDivision(0,0);
        showDivision(10,5);
        showDivision(1,0);
        showDivision(0,5);
    }
    private static void showDivision(int num1, int num2) {
        if (num2==0 && num1==0) {
            print("Uncertainty 0/0");
        } else {
            if (num2==0) {
                print("Second argument is zero");
            } else {
                print(num1/num2);
            }
        }
    }
    private static void print(String result) {
        System.out.println(result);
    }
    private static void print(int result) {
        System.out.println(result);
    }
}