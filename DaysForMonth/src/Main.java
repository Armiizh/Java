//                 Задание
// Написать метод, который принимает строкой аргумент месяца и выдает количество дней в этом месяце в 2023 году.
public class Main {
    public static void main(String[] args) {
        print(getDaysForMonth("January"));
        print(getDaysForMonth("january"));
        print(getDaysForMonth("JanuAry"));
        print(getDaysForMonth("JANUARY"));
        print(getDaysForMonth("February"));
        print(getDaysForMonth("March"));
        print(getDaysForMonth("April"));
        print(getDaysForMonth("May"));
        print(getDaysForMonth("June"));
        print(getDaysForMonth("July"));
        print(getDaysForMonth("August"));
        print(getDaysForMonth("September"));
        print(getDaysForMonth("October"));
        print(getDaysForMonth("November"));
        print(getDaysForMonth("December"));
        print(getDaysForMonth("январь"));
        print(getDaysForMonth("Январь"));
    }
    private static String getDaysForMonth (String month) {
        String result;
        int days = -1;
        switch (month.toLowerCase()) {
            case "january", "march", "may", "july", "august", "october", "december","январь":
                days = 31;
            case "february":
                days = 28;
            case "april", "june", "september", "november":
                days = 30;
            default:
                if (days>0) {
                    result = month + " has " + days + " days.";
                } else {
                    throw new IllegalArgumentException("invalid month "+month);
                }
        }
        return result;
    }
    private static void print (String result) {
        System.out.println(result);
    }
}