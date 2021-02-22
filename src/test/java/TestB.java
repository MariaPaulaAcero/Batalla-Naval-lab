import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;


public class TestB {


    @Test

    @DisplayName("GIVEN WHEN THEN")

    public void alias() {

        List<Navy> navies = new ArrayList<>();

        Navy n1 = new Navy("M");
        Navy n2 = new Navy("P");
        Navy n3 = new Navy("M");

        navies.add(n1);
        navies.add(n2);
        navies.add(n3);

        Board b = new Board(navies);

        int resul1 = n1.alias();
        assertEquals(1, resul1);

        int resul2 = n2.alias();
        assertEquals(0, resul2);

    }

    @Test
    @DisplayName("GIVEN WHEN THEN")

    public void availabilityAircraft (){

        Navy navy1 = new Navy("T");
        AircraftCarrier a1 = new AircraftCarrier(900,navy1.capacity);
        Aircraft aa1 = new Aircraft("JB900",false);

        navy1.aircraftCarriers.add(a1);
        navy1.aircrafts.add(aa1);

        assertEquals(navy1.capacity-1,navy1.availabilityAircraft());



    }


}



