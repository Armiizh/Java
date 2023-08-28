public class Designer extends Employee {
    protected Designer(TaskProgressCallback callback,
                       String name) {
        super (callback, name, Task.Status.ASSEMBLING_REQUIREMENTS);
    }

    @Override
    protected Task getTaskWhenDone(Task task) {
        return new Task(
                task.getId(),
                Task.Status.READY_TO_GO,
                task.getDescription(),
                getDesignLinkForTask(task.getId()),
                getTestCaseForTask(task.getDescription()),
                ""
        );
    }

    @Override
    protected String getDetails(Task task) {
        return " with taskId" + task.getId() + " and description " + task.getDescription();
    }

    private String getDesignLinkForTask(int taskId) {
        return "https://project/design_link_for_task_with_id " + taskId;
    }

    private String getTestCaseForTask(String taskDescription) {
        return "when " + taskDescription + " get result " + Math.random();
    }
}
