// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        FigureFactory factory = new FigureFactory();
        Figure figure = factory.create(3,3,3);
        showDescription(figure);
    }
    private static void showDescription(Figure figure) {
        switch (figure.getType()) {
            case CIRCLE:
                print("this is a circle");
                break;
            case RECTANGLE:
                print("this is rectangle");
                break;
            case TRIANGLE:
                print("this is triangle");
                break;
            default:
                print("undefined figure!");
        }
    }
    private static void print(Figure... figures) {
        for (Figure figure: figures) {
            print((figure.toString()));
        }
    }
    private static void print(String result) {
        System.out.println(result);
    }
}