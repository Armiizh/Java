import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        List<Question> questions = new ArrayList<>();
        System.out.println("Первая развилка:\n" +
                "-налево;\n" +
                "-направо;\n" +
                "-прямо.\n");

        questions.add(new Question("налево"));
        //questions.add(new Question("направо"));
       // questions.add(new Question("прямо"));
        FAQChain chain0 = new Q1();
        FAQChain chain1 = new Q2();
        FAQChain chain2 = new Q3();
        chain2.setNext(chain1);
        chain1.setNext(chain0);

        for (Question question : questions) {
            System.out.println(chain0.getAnswer(question));

            System.out.println("\nВторая развилка:");

        }
    }
}