import java.util.ArrayList;
import java.util.List;

public class Aircraft {

    private String licencePlate;
    private boolean inAir;
    //private String currentLicence;

    private Marine copilot;
    private Marine pilot;
    private Position location;
    //private static List<String> inAirs = new ArrayList<>();


    public Aircraft(String licencePlate, boolean inAir) {
        this.licencePlate = licencePlate;
        this.inAir = inAir;

    }

    public String getLicencePlate() {
        return licencePlate;
    }

    public void setLicencePlate(String licencePlate) {
        this.licencePlate = licencePlate;
    }


   /* public static <Aircraft> inAirs getLicencePlate() {
        return null;
    }

    private static class inAirs {
    }

    */
}

