public class Airplane {

    // ================SIMULATOR==================

    public static void main(String[] args) {
        Airplane USSDELICIOUS = new Airplane(4, 120, 1990, "Red Baron");

        Pizza philly = new Pizza();

        philly.getCrust();


    // ================FIELDS==================


    private int wings;
    private int fuelCapacity;
    private int yearManufactured;
    private String model;

    // ================CONSTRUCTORS==================



    public Airplane() {
    }

    public Airplane(int wings, int fuelCapacity, int yearManufactured, String model) {
        this.wings = wings;
        this.fuelCapacity = fuelCapacity;
        this.yearManufactured = yearManufactured;
        this.model = model;
    }

    // ================Behaviors==================

    public void travel(int distance) {
        setFuelCapacity(distance * 4);
    }



    // ================Getters and Setters==================

    public int getWings() {
        return wings;
    }

    public void setWings(int wings) {
        this.wings = wings;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int changeInFuel) {
        if (changeInFuel > 0 && this.fuelCapacity > changeInFuel) {
            this.fuelCapacity = changeInFuel;
        } else {
            System.out.println("INVALID PARAMETER");
        }
    }

    public int getYearManufactured() {
        return yearManufactured;
    }

    public void setYearManufactured(int yearManufactured) {
        this.yearManufactured = yearManufactured;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    // ==================================


}
