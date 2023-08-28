import java.util.ArrayList;
import java.util.List;

//                 Задания
// Написать цепочку из валидаторов для пароля. Первое звено должно проверить, что входящая срока (String)
// не является пустой. Если проходим валидацию, отдаем следующему звену на проверку, если же строка была пустой,
// то кидаем исключение с сообщением типа – пустой пароль. Далее добавляем еще звенья – валидатор минимальной длины –
// в конструктор получаем число для минимального количества и проверяем, что пароль не меньше этой длины. Если меньше,
// то бросаем исключение. Если удовлетворяет этому правилу, то отдаем ответственность следующему звену. Написать
// еще одно звено для определения, что среди символов есть как минимум одна цифра.
public class Main {
    public static void main(String[] args) {
        List<Password> passwords = new ArrayList<>();
        passwords.add(new Password(""));
        passwords.add(new Password("qwerty"));
        passwords.add(new Password("qwerty123"));
        passwords.add(new Password("abc9"));
        passwords.add(new Password(" "));
        PasswordChain chain0 = new CheckEmpty();
        PasswordChain chain1 = new MinimumLength();
        PasswordChain chain2 = new NumberCheck();
        chain0.setNext(chain1);
        chain1.setNext(chain2);


        for (Password password : passwords) {
            System.out.println(chain0.getValidation(password));
            System.out.println(chain1.getValidation(password));
            System.out.println(chain2.getValidation(password));
        }
    }
}