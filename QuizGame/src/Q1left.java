public class Q1left extends Que{

    protected Q1left(String name, String vibor) {
        super(name, vibor, Task.Status.first_choose_left);
    }

    @Override
    public Task getTaskWhenDone(Task task) {
        if (task.getVibor()=="left") {
            new Task(
                    task.getId(),
                    task.getVibor(),
                    Task.Status.second_choose_left,
                    task.getDescription()
            );
        } else if (task.getVibor()=="straight") {
            new Task(
                    task.getId(),
                    task.getVibor(),
                    Task.Status.second_choose_straight,
                    task.getDescription()
            );
        } else if (task.getVibor()=="right") {
            new Task(
                    task.getId(),
                    task.getVibor(),
                    Task.Status.second_choose_right,
                    task.getDescription()
            );
        }
        return task;
    }
}

