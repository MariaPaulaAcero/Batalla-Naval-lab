public class Ship {

    private int numberId;
    private Position location;
    private Marine marine;

    private boolean goodAttack;
    private String sameShip;
    private String diferentShip;


    public Position getLocation() {
        return location;
    }

    public Ship(int numberId, Position location) {
        this.numberId = numberId;
        this.location = location;



    }


}
