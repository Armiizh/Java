import java.util.List;
import java.util.concurrent.TimeUnit;

public class JOB {

    private final List<Truck> trucks;
    private boolean isBusy;


    public JOB(List<Truck> trucks, boolean isBusy) {
        this.trucks = trucks;
        this.isBusy = isBusy;
    }



    @Override
    public String toString() {
        StringBuilder description = new StringBuilder();
        description.append("Грузчик ждёт фуру. Его статус isBusy: "+isBusy);
        for (Truck truck:trucks) {
            description.append("\nГрузовик приехал, его данные:"+truck.toString()+"\n");
            isBusy=true;

            description.append("Грузчик начал разгружать фуру. Его статус isBusy: "+isBusy);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            description.append("\n");
            isBusy=false;
        }
        return description.toString();
    }
}


