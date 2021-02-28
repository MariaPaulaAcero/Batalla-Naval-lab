import java.util.ArrayList;
import java.util.Currency;
import java.util.List;
import java.util.Objects;

public class Navy {

    private String name;
    public final String code="";
    public final int capacity=100;

    private Aircraft avion;
    private Marine marine;
    private AircraftCarrier portaAviones;
    private Position location;
    private Ship ship;
    private Board board= new Board();



    private int currentCapacity=1;
    private int availability;
    public List<Aircraft> aircrafts = new ArrayList<>();
    private List<Ship> shipss = new ArrayList<>();
    public List<AircraftCarrier> aircraftCarriers = new ArrayList<>();

    public List<Aircraft> getAircrafts() {
        return aircrafts;
    }

    public List<Ship> getShipss() {
        return shipss;
    }

    public List<AircraftCarrier> getAircraftCarriers() {
        return aircraftCarriers;
    }



    @Override
    public boolean equals(Object m) {//Metodo
        if (m == null) {
            return false;
        }
        if (m instanceof Navy) {
            return false;
        }

        Navy n1= (Navy) m; //castear
        return name == board.getName();


    }



    public Navy(String name) {
        this.name=name;

        }

    public String getName() {
        return name;
    }

    /*
     * Consulta el número de flotas que tienen su mismo nombre
     *
     * @returns: numero de flotas con el mismo nombre
     */
    public int alias() {
        return board.countNavies(name)-1;


    }
    /**
     * Consulta la disponibilidad total de los portaaviones
     *
     * @returns: numero de nuevos aviones que podrían cargarse a los portaaviones
     */

    public int availabilityAircraft (){
      AircraftCarrier air2 = new AircraftCarrier(3,100,new Position(3,5));


      if (currentCapacity < capacity ){
          availability= capacity-currentCapacity;
      }
        return availability;
    }

    /**
     * Verifica si una ubicación de ataque en agua es adecuado(destruye elementos
     * enemigos sin ocasionar bajas propias)
     *
     * Parameters:
     *   longitud - longitud de la explosion
     *   latitud - latitud de la explosion
     */


    public boolean goodAttack (int latitude, int length) {

        if(getShipss().get(0).getLocation().getLatitude() == latitude&&getShipss().get(0).getLocation().getLength() == length){
            return false;
        }
        return true;
    }

    /**
     * Consulta las máquinas que pueden afectarse por una explosion en agua
     *
     * Parameters:
     *   longitud - longitud de la explosion
     *   latitud - latitud de la explosion
     */
    ArrayList<Object>objects = new ArrayList<>();
    public ArrayList<Object> willBeDistroyed(int latitude,int length) {

        if (getShipss().get(0).getLocation().getLatitude() == latitude && getShipss().get(0).getLocation().getLength() == length) {
            objects.add(shipss.get(0));
            objects.add(aircraftCarriers.get(0));
        }
        return objects;
    }
    public void muevase(int deltaLongitud,int deltaLatitud){


    }

}


