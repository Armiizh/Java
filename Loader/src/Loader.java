import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class Loader {

    private static int TRUCK_NUMBER_FOR_JOB = 1;
    private final List<Truck> trucks;
    private boolean isBusy;

    public Loader(){
        trucks = new ArrayList<>();
    }

    public void handleTruck(Truck truck) {

        if (trucks.size() == 1) {
            System.out.println(new JOB(trucks, isBusy));
            trucks.clear();
        } else {
                trucks.add(truck);
            }
        }
    }