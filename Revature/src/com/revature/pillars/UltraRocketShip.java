package com.revature.pillars;

import com.revature.blueprints.RocketShip;

/*
*
* Members of a class- variables and Methods
* Static and Instance forms
* Instance variables- property of one specific object.
* Static variables- belong to ALL UltraRocketShips.
*
* Instance methods- Behavior related to a specific object (i.e. Blastoff (See Rocket class))
* Static Methods - Behavior relative to the entire class/all objects of that type.
* Final - value cannot be changed
*   static final variables are constants _STATICFINAL_
*   Final instance variables cannot be changed once initialized.
* Final Method- a method that cannot be overridden
* Final Class- Cannot be extended. No more inheritance.
* */


public class UltraRocketShip extends RocketShip {
    private boolean hasBar;
    private String warpDriveModel;


    static private String manufacturer = "Ford";

    // Default Constructor
    public UltraRocketShip(){
        super();
        this.setMiniFridge(true);
    }

    // Constructor with Parameters
    public UltraRocketShip(boolean hasBar, String warpDriveModel) {
        this.setMiniFridge(true);
        this.hasBar = hasBar;
        this.warpDriveModel = warpDriveModel;
    }

    public UltraRocketShip(String name, int numOfRockets, int maxFuel, boolean miniFridge, boolean hasBar, String warpDriveModel) {
        super(name, numOfRockets, maxFuel, miniFridge);
        this.setMiniFridge(true);
        this.hasBar = hasBar;
        this.warpDriveModel = warpDriveModel;
    }

    public UltraRocketShip(int numOfThrusters, int maxFuel, boolean isMiniFridge, boolean hasBar, String warpDriveModel) {
        super(numOfThrusters, maxFuel, isMiniFridge);
        this.setMiniFridge(true);
        this.hasBar = hasBar;
        this.warpDriveModel = warpDriveModel;
    }

    //Getters and Setters

    public boolean isHasBar() {
        return hasBar;
    }

    public void setHasBar(boolean hasBar) {
        this.hasBar = hasBar;
    }

    public String getWarpDriveModel() {
        return warpDriveModel;
    }

    public void setWarpDriveModel(String warpDriveModel) {
        this.warpDriveModel = warpDriveModel;
    }

    public static String getManufacturer() {
        return manufacturer;
    }

    @Override
    public String toString() {
        String rocketClass = this.hasBar ? "Deluxe" : "Regular";
        return "Ultra" + (super.toString()) +
                "\nClass: " + rocketClass +
                "\nwarpDriveModel='" + warpDriveModel +
                "\nProudly produced by" + manufacturer;
    }
}
