public class Car {


    // ================GETTERS AND SETTERS==================


    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Car(int doors, int wheels, String model, String engine, String colour) {
        this.doors = doors;
        this.wheels = wheels;
        this.model = model;
        this.engine = engine;
        this.colour = colour;
    }

    public Car(int doors) {
        this.doors = doors;
    }

    // ================OVERRIDE METHODS==================



    @Override
    public String toString() {
        return "Car{" +
                "doors=" + doors +
                ", wheels=" + wheels +
                ", model='" + model + '\'' +
                ", engine='" + engine + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }

    // ================FIELDS==================


    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;


}
