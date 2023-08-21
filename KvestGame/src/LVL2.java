public class LVL2 extends Levels {

    protected LVL2(TaskProgressCallback callback, String name) {
        super(callback, name, Task.Status.LVL1_END);
    }

    @Override
    protected Task getTaskWhenDone(Task task) {
        return new Task(
                task.getId(),
                Task.Status.LVL2_END,
                task.getDescription(),
                task.getBow(),
                getSwordForTask(task.getDescription()),
                getShieldForTask(task.getDescription())
        );
    }

    @Override
    protected String getDetails(Task task) {
        return " и встретил преподавателя, который требует от тебя решения задачи "+ task.getId() + " ты ему рассказываешь "  + task.getDescription();
    }

    private String getSwordForTask(String taskDescription) {
        return "When " + taskDescription + " get result" + Math.random();
    }
    private String getShieldForTask(String taskDescription) {
        return "When " + taskDescription + " get result" + Math.random();
    }
}
