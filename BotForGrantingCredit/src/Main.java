import java.util.Scanner;
//                           Задание
//Пишем бота для выдачи кредита. Условия кредита придумать свои.
//Главное собрать от юзера данные и обработать их.
//В итоге выдать вам одобрен кредит или нет.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        print("Введите вашу заработную плату");
        int zp = scanner.nextInt();

        if (zp > 25000 && zp<200_000) {

            print("Введите сумму и срок, на который вы бы хотели взять кредит");

            int Sum = scanner.nextInt();
            int Timeline = scanner.nextInt();


            if (zp<50_000) {


                if (Sum<100_000 && Timeline<5) {
                    print("Вам одобрен кредит");
                } else {
                    print("Кредит вам не одобрен");
                }
            }


            else if (zp<100_000) {


                if (Sum<250_000 && Timeline<5) {
                    print("Вам одобрен кредит");
                } else {
                    print("Кредит вам не одобрен");
                }
            }


            else if (zp<200_000) {


                if (Sum<500_000 && Timeline<5) {
                    print("Вам одобрен кредит");
                } else {
                    print("Кредит вам не одобрен");
                }
            }
        }


        else if (zp>200_000) {
            print("Зачем вам вообще кредит с такой заработной платой?:)");
        }


        else {
            print("Вашей заработной платы не достаточно для взятия кредита");
        }


    }
    public static void print(String result){
        System.out.println(result);
    }
}
