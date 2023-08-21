//                 Задание
// Имитация игры. Звенья цепи будут уровни. Игра типа квест. У каждого уровня/звена будет свой вопрос или
// несколько вопросов с какими-то верными ответами или же любой ответ будет допустим, но из списка предложенных.

public class Main {
    public static void main(String[] args) {
        TaskFactory factory = new TaskFactory();
        TaskProgressCallback callback = new CallbackImpl(factory);
        System.out.println("Перед тобой институт! Развилка:\n" +
                "-налево;\n" +
                "-прямо;\n" +
                "-направо;\n" +
                "Куда пойдешь, чтобы не нарваться на препода или декана?\n");
        LevelChain chain = new LevelChain(new LVL1(callback, "Налево"));
        LevelChain next = new LevelChain(new LVL2(callback, "Прямо"));
        LevelChain last = new LevelChain(new LVL3(callback, "Направо"));
        next.setNextLevelChain(last);
        chain.setNextLevelChain(next);

        while (true) {
            chain.doTask(factory.getTask());
        }
    }
}