public abstract class Que {

    private final String name;
    private final Task.Status taskStatus;
    private final String vibor;

    protected Que(String name, String vibor, Task.Status taskStatus) {
        this.name = name;
        this.taskStatus = taskStatus;
        this.vibor = vibor;
    }

    public Task.Status getTaskStatus() {
        return taskStatus;
    }
    public abstract Task getTaskWhenDone(Task task);
}
