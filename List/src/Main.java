import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("first");
        list.add("1");
        list.add("23");
        list.add("second");
        list.add("234");
        list.sort(Comparator.comparingInt(String::length));
        for (String string : list) {
            System.out.println(string + " ");
        }
    }
}