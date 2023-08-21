public abstract class Levels {

    private final TaskProgressCallback callback;
    private final String name;
    private final Task.Status taskStatus;

    protected Levels(TaskProgressCallback callback,
                     String name,
                     Task.Status taskStatus) {
        this.callback = callback;
        this.name = name;
        this.taskStatus = taskStatus;
    }

    public void doTask(Task task) {
        System.out.println(name+getDetails(task)+"\n");
        callback.updateTask(getTaskWhenDone(task));
    }

    public Task.Status getTaskStatus() {
        return taskStatus;
    }

    protected abstract Task getTaskWhenDone(Task task);

    protected abstract String getDetails(Task task);

}
