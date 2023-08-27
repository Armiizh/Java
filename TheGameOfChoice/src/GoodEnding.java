public class GoodEnding extends Chain {

    @Override
    int Way(Select select) {
        if (select.getSelect().toLowerCase() == "налево") {
            return 1;
        } else if (select.getSelect().toLowerCase() == "направо") {
            return 2;
        } else if (select.getSelect().toLowerCase() == "прямо") {
            return 3;
        } else {
            return 4;
        }
    }

    @Override
    public String Selection(Choice choice) {
        return "asdfdasdhas";
    }
}
