import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class TaskFactory {

    private static final int SIZE = 4;
    private final Task[] tasks;
    private final List<Column> columns;

    public TaskFactory() {
        tasks = new Task[SIZE];
        for (int i = 0; i<SIZE; i++) {
            tasks[i] = new Task(i, Task.Status.ASSEMBLING_REQUIREMENTS,
                    "description " + i, "", "", "");
        }

        columns = new ArrayList<>();
        columns.add(new Column(Task.Status.ASSEMBLING_REQUIREMENTS));
        columns.add(new Column(Task.Status.READY_TO_GO));
        columns.add(new Column(Task.Status.READY_FOR_TESTING));
        columns.add(new Column(Task.Status.DONE));
    }

    public void addEmployees(List<Employee> employees) {
        for (Employee employee : employees) {
            for (Column column : columns) {
                if (employee.canBeObserverForColumn(column)) {
                    column.registerObserver(employee);
                }
            }
        }
    }

    @NotNull
    public Task getTask() {
        Task result = null;
        for (Task task : tasks) {
            if (task.getStatus() != Task.Status.DONE) {
                result = task;
                break;
            }
        }

        if (result == null) {
            result = tasks[0];
        }
        return result;
    }

    public void updateTask(Task oldTask, Task newTask) {
        for (Column column : columns) {
            if (column.contains(oldTask.getStatus())) {
                column.removeTask(oldTask);
            }
            if (column.contains(newTask.getStatus())) {
                column.addTask(newTask);
            }
        }
    }

    public void start() {
        for (Task task : tasks) {
            columns.get(0).addTask(task);
        }
    }
}
