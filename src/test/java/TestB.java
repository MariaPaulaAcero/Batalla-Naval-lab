import java.util.ArrayList;
import java.util.List;
import java.util.NavigableMap;

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
    @DisplayName("GIVEN a list with enemies aircraft´s license plates on air WHEN compare sizes THEN must be the same")

    public void enemiesLicencePlateOnAir (){

        Position po = new Position(12,20);
        AircraftCarrier a1 = new AircraftCarrier(600, 100,po);
        Aircraft aa1 = new Aircraft("JB600", false);
        Aircraft aa2 = new Aircraft("JK600", true);
        Navy navy1 = new Navy("M");

        navy1.getEnemiesAircrafts().add(aa1);
        navy1.getEnemiesAircrafts().add(aa2);
        navy1.getAircraftCarriers().add(a1);


        int result = navy1.enAire().size();

        assertEquals(1, result);
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
    @DisplayName("GIVEN WHEN THEN")

    public void confuseEnemiesAircraftswithOwnAircrafts (){

        Position po = new Position(12,20);
        AircraftCarrier a1 = new AircraftCarrier(700, 100,po);
        Aircraft aa1 = new Aircraft("JB700", true);
        Aircraft aa2 = new Aircraft("JB700", true);
        Navy navy1 = new Navy("M");

        navy1.getEnemiesAircrafts().add(aa1);
        navy1.getOwnAircrafts().add(aa2);
        navy1.getAircraftCarriers().add(a1);

        boolean confuse = navy1.problemaEnAire();

        assertTrue(confuse, "There was a confuse between enemies License plates and own");
    }
    @Test
    @DisplayName("GIVEN WHEN THEN")

    public void muevase (){
        Position po = new Position(12,20);
        Navy navy1 = new Navy("T");
        Ship ship = new Ship(1,po);
        List<Navy> navies = new ArrayList<>();


        Board b = new Board(navies);
        navies.add(navy1);
        navy1.getShipss().add(ship);
        navy1.muevase(15,30);


        assertEquals(15,navy1.getShipss().get(0).getLocation().getLatitude());
        assertEquals(30,navy1.getShipss().get(0).getLocation().getLength());


    }

}




