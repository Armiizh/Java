import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Logger logger = new Logger(new ArrayList<>());
        List<Thread> threads = new ArrayList<>();

        for (int i =0; i < 5; i++) {
            int finalI = i;
            threads.add(new Thread(() ->
                    logger.addLog("Header " + finalI, "body " + finalI)));
        }

        for (Thread thread : threads) {
            thread.start();
        }

        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                logger.print();
            }
        };
        Timer timer = new Timer();
        timer.schedule(task, 1000);
    }
}