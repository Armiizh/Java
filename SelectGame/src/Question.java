public class Question {

    private final String vibor;

    public Question(String vibor) {
        this.vibor = vibor;
    }

    public String getVibor() {
        return vibor;
    }
    enum Status {
        start,
        razvilka1end,
        razvilka2end,
        end
    }
}
