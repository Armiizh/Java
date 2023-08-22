import java.util.ArrayList;
import java.util.List;

public class Truck {

    private final int id;

    private final int volume;

    public Truck(int id, int volume) {
        this.id = id;
        this.volume = volume;
    }

    @Override
    public String toString() {
        return " Truck {" + "id=" + id + " with volume = " + volume + "}";
    }
}

