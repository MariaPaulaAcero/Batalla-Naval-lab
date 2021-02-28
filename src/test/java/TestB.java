import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


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

    public void availabilityAircraft() {

        Navy navy1 = new Navy("T");
        AircraftCarrier a1 = new AircraftCarrier(900, navy1.capacity,new Position(5,6));
        Aircraft aa1 = new Aircraft("JB900", false);

        navy1.aircraftCarriers.add(a1);
        navy1.aircrafts.add(aa1);

        assertEquals(navy1.capacity - 1, navy1.availabilityAircraft());


    }


    @Test
    @DisplayName("GIVEN WHEN THEN ")

    public void goodAttack (){

        Navy navy1 = new Navy("T");
        Position po = new Position(12,20);
        Ship ship = new Ship(1,po);
        AircraftCarrier air = new AircraftCarrier(1,5,po);

        navy1.getShipss().add(ship);
        navy1.getAircraftCarriers().add(air);

        assertTrue(navy1.goodAttack(20,20));
        assertFalse(navy1.goodAttack(12,20));
    }


    @Test
    @DisplayName("GIVEN WHEN THEN ")

    public void willBeDestroyed (){

        Navy navy1 = new Navy("T");
        Position po = new Position(12,20);
        Ship ship = new Ship(1,po);
        AircraftCarrier air = new AircraftCarrier(1,5,po);
        ArrayList<Object> objects = new ArrayList<>();

        navy1.getShipss().add(ship);
        navy1.getAircraftCarriers().add(air);
        objects.add(ship);
        objects.add(air);


        assertEquals(objects,navy1.willBeDistroyed(12,20));

    }

    @Test
    @DisplayName("GIVEN WHEN THEN ")

    public void muevase (){

      

    }
}




