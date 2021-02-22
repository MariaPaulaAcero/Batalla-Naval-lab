public class Aircraft {

    private String licencePlate;
    private boolean inAir;

    private Marine copilot;
    private Marine pilot;
    private Position location;


    public Aircraft(String licencePlate, boolean inAir) {
        this.licencePlate = licencePlate;
        this.inAir = inAir;
    }
}

