import java.util.ArrayList;
import java.util.List;
public class AircraftCarrier {

    private int numberId;
    public int capacity;
    private Marine captain;

    private List<Marine> marines;
    private List<Aircraft> aircrafts=new ArrayList<>();
    private Position location;


    public AircraftCarrier(int numberId, int capacity) {
        this.numberId = numberId;
        this.capacity = capacity;
    }
}
