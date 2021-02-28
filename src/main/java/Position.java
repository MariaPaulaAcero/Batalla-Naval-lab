public class Position {

    private int latitude;
    private int length;


    public Position(int latitude, int length) {
        this.latitude = latitude;
        this.length = length;

    }
    public void setLatitude(int latitude) {
        this.latitude = latitude;
    }

    public void setLength(int length) {
        this.length = length;
    }


    public int getLatitude() {
        return latitude;
    }

    public int getLength() {
        return length;
    }

}
