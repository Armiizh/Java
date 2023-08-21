public class LVL1 extends Levels {

    protected LVL1(TaskProgressCallback callback, String name) {
        super(callback, name, Task.Status.START);
    }

    @Override
    protected Task getTaskWhenDone(Task task) {
        return new Task(
                task.getId(),
                Task.Status.LVL1_END,
                task.getDescription(),
                getBowForTask(task.getDescription()),
                "",
                ""
        );
    }

    @Override
    protected String getDetails(Task task) {
        return " и перед тобой задача под номером "+ task.getId() + ": "  + task.getDescription();
    }

    private String getBowForTask(String taskDescription) {
        return "When " + taskDescription + " get result" + Math.random();
    }
}
