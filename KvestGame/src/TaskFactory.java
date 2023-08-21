public class TaskFactory {

    private static final int SIZE = 3;
    private final Task[] tasks;

    public TaskFactory() {
        tasks = new Task[SIZE];
        for (int i = 0; i < SIZE; i++) {
            tasks[i] = new Task(i, Task.Status.START, "'описание задачи' " + i + " потом ты идешь", "" ,"" ,"");
        }
    }

    @NotNull
    public Task getTask() {
        Task result = null;
        for (Task task : tasks) {
            if (task.getStatus() != Task.Status.LVL3_END) {
                result = task;
                break;
            }
        }

        if (result == null) {
            result = tasks[0];
        }
        return result;
    }

    public void updateTask(Task task) {
        for (int i=0; i < SIZE; i++) {
            if (tasks[i].getId() == task.getId()) {
                tasks[i] = task;
                break;
            }
        }
    }
}
