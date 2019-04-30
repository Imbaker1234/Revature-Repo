public class Boat {

    // ================FIELDS==================


    private int length;
    private int width;
    private String type;
    private String motor;

    // ================BEHAVIORS==================
    private Boat br1 = new Boat(22, 10, "Sailboat", "none");

    // ================CONSTRUCTORS==================
    public Boat() {
    }

    public Boat(int length, int width, String type, String motor) {
        this.setLength(length);
        this.setWidth(width);
        this.setType(type);
        this.setMotor(motor);
    }

    // ================GETTERS AND SETTERS==================

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    // ================OVERRIDDEN==================

    @Override
    public String toString() {
        return "Boat{" +
                "length=" + getLength() +
                ", width=" + getWidth() +
                ", type='" + getType() + '\'' +
                ", motor='" + getMotor() + '\'' +
                '}';
    }

    public Boat getBr1() {
        return br1;
    }

    public void setBr1(Boat br1) {
        this.br1 = br1;
    }
}
