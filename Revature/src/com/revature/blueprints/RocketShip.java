package com.revature.blueprints;

public class RocketShip {
    private String name;
    private int numOfThrusters;
    private int fuelCapacity;
    private boolean isMiniFridge;

    public RocketShip() {
        super();
    }

    public RocketShip(String name, int numOfRockets, int maxFuel, boolean miniFridge ) {
        this.setName(name);
        this.setNumOfThrusters(numOfRockets);
        this.setFuelCapacity(maxFuel);
        this.setMiniFridge(miniFridge);
    }

    public RocketShip(int numOfThrusters, int maxFuel, boolean isMiniFridge) {
        numOfThrusters= this.getNumOfThrusters();
        maxFuel= this.getFuelCapacity();
        isMiniFridge= this.isMiniFridge();
    }

    //Behaviors

    public void blastOff(){
        System.out.println(this.getName() + " blasts off!");
    }


    //Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumOfThrusters() {
        return numOfThrusters;
    }

    public void setNumOfThrusters(int numOfThrusters) {
        this.numOfThrusters = numOfThrusters;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public boolean isMiniFridge() {
        return isMiniFridge;
    }

    public void setMiniFridge(boolean miniFridge) {
        isMiniFridge = miniFridge;
    }

    @Override
    public String toString() {
        String modelType = isMiniFridge() ? "Pleasure" : "Business";
        String returnVar = ("Rocket: " + getName() + "\n" + "Thrusters: " + getNumOfThrusters() + "\n" + "Fuel Capacity: " + getFuelCapacity() + "\n" + "Designation: " + modelType);
        return returnVar;
    }
}