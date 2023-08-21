public class LVL3 extends Levels {

    protected LVL3(TaskProgressCallback callback, String name) {
        super(callback, name, Task.Status.LVL2_END);
    }

    @Override
    protected Task getTaskWhenDone(Task task) {
        return new Task(
                task.getId(),
                Task.Status.LVL3_END,
                task.getDescription(),
                task.getBow(),
                task.getSword(),
                task.getShield()
        );
    }

    @Override
    protected String getDetails(Task task) {
        return " и видишь декана институт, говорящий тебе, что без задачи "+ task.getId() + " он отчислит тебя, но ты рассказываешь ему "  + task.getDescription();
    }
}
