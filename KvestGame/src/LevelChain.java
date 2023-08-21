public class LevelChain {

    private final Levels levels;
    private LevelChain nextLevelChain;

    public LevelChain(Levels levels) {
        this.levels = levels;
    }

    public void doTask(Task task) {
        if (task.getStatus() == levels.getTaskStatus()) {
            levels.doTask(task);
        } else if (nextLevelChain != null) {
            nextLevelChain.doTask(task);
        } else {
            throw new IllegalArgumentException("task can't be handled");
        }
    }

    public void setNextLevelChain(LevelChain nextLevelChain) {
        this.nextLevelChain = nextLevelChain;
    }
}
