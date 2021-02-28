import java.util.ArrayList;
import java.util.List;

public class Board {

    public final int maxPositionLatitud = 100;
    public final int minPositionLatitud = -100;
    public final int maxPositionLenght = 100;
    public final int minPositionLenght = -100;

    private AircraftCarrier aircraftCarrier;
    private Aircraft aircraft;
    private Ship ship;
    private Marine marine;
    private Navy navy;
    private String name;

    public int getMaxPositionLatitud() {
        return maxPositionLatitud;
    }

    public int getMinPositionLatitud() {
        return minPositionLatitud;
    }

    public int getMaxPositionLenght() {
        return maxPositionLenght;
    }

    public int getMinPositionLenght() {
        return minPositionLenght;
    }



    private static List<Navy> navies = new ArrayList<>();


    public Board (List<Navy>n1){
        navies=n1;

    }

    public Board() {

    }

    public int countNavies(String alias){
        this.name=alias;
        int count=0;
        for (Navy n : navies) {
            System.out.println(1);

            if (n.getName().equals(alias)) {
                System.out.println(0);
                count++;
            }
        }

        return count;


        }

    public String getName() {
        return name;
    }

}
