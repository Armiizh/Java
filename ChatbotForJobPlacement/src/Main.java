import java.util.Scanner;
//                      Задание
//Пишем чатбота для устройства на работу. Вопросы и условия придумать самим.
//Если все подходит - вывести - вы приняты на работу, иначе - отказано.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        print("Здравствуйте, для устройства на работу через данного чатбота \n" +
                "необходимо пройти небольшое тестирование.\n " +
                "Введите 1 - если вы согласны;\n " +
                "Введите 2 - если вы не согласны.");
        int YesOrNo = scanner.nextInt();
        String Exp;

        if (YesOrNo == 2) {
            print("До свидания!");
        } else if (YesOrNo == 1) {

            print("Отлично! Тогда начнем!\n" +
                    "Для начала укажите ваш возраст.");
            int Age = scanner.nextInt();

            if (Age < 18) {
                print("Извините, но возраст должен быть не меньше 18.");
            } else if (Age > 70) {
                print("Извините, ваш возраст слишком большой для данной работы.");
            } else {
                print("Выберите ваш уровень образования:\n" +
                        "1 - Высшее;\n" +
                        "2 - Среднее;\n" +
                        "3 - Нет образования.");
                int education = scanner.nextInt();
                if (education == 3 || education == 2) {
                    print("Извините, для данной работы необходимо иметь высшее образование.");
                } else {
                    print("Отлично! Укажите, пожалуйста, есть ли у вас опыт работы?\n" +
                            "1 - Есть\n" +
                            "2 - Нет опыта");
                    int exp = scanner.nextInt();
                    if (exp == 2) {
                        print("Извините, но нам важен ваш прошлый опыт работы.");
                    } else {
                        print("Отлично! Остался последний этап!\n" +
                                "Расскажите нам о своем опыте работы и оставьте ваши контактные данные в поле для ввода,\n" +
                                "чтобы мы могли с вами связаться.");
                        Exp = scanner.next();
                        if (!Exp.isEmpty() == true) {
                            print("Спасибо за ваше обращение, мы передали ваш опыт нашим сотрудникам,\n" +
                                    "которые скоро с вами свяжутся.");
                        }
                    }
                }
            }
        }
    }
        public static void print(int result) {
            System.out.println(result);
        }
        public static void print(String result) {
            System.out.println(result);
        }
    }