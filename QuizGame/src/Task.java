public class Task {

    public static Task.Status Status;
    private final int id;
    private final String description;
    public final Status status;
    private String vibor;

    public Task(int id,
                String description,
                Status status,
                String vibor) {
        this.id = id;
        this.description = description;
        this.status = status;
        this.vibor = vibor;
    }

    public int getId() {
        return id;
    }
    public String getDescription() {
        return description;
    }

    public String getVibor() {
        return vibor;
    }

    enum Status {
        start,
        first_choose_left,
        first_choose_straight,
        first_choose_right,
        second_choose_left,
        second_choose_straight,
        second_choose_right,
        end
    }
}
