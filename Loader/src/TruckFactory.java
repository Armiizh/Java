import java.util.Timer;
import java.util.TimerTask;

public class TruckFactory {

    private final TruckCallback truckCallback;
    private final Timer timer;

    private int count;

    public TruckFactory(TruckCallback truckCallback) {
        this.truckCallback = truckCallback;
        this.timer = new Timer();
    }


    void start() {
        final TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                truckCallback.provideTruck(new Truck(count,50));
                if (++count == 10) {
                    timer.cancel();
                }
            }
        };
        timer.scheduleAtFixedRate(timerTask, 0, 3000);
    }
}
