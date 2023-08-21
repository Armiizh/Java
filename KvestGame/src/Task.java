public class Task {

    private final int id;
    private final Status status;
    private final String description;
    private final String bow;
    private final String sword;
    private final String shield;

    public Task(int id,
                Status status,
                String description,
                String bow,
                String sword,
                String shield) {
        this.id = id;
        this.status = status;
        this.description = description;
        this.bow = bow;
        this.sword = sword;
        this.shield = shield;
    }

    public int getId() {
        return id;
    }

    public Status getStatus() {
        return status;
    }

    public String getDescription() {
        return description;
    }

    public String getBow() {
        return bow;
    }

    public String getSword() {
        return sword;
    }

    public String getShield() {
        return shield;
    }

    enum Status {
        START,
        LVL1_END,
        LVL2_END,
        LVL3_END,
    }
}
