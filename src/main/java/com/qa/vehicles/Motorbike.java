package com.qa.vehicles;

public class Motorbike extends Vehicle {

    private String bikeStyle;

    public Motorbike(int numberOfWheels, int engineSizeInLitres, String bikeStyle) {
        super(numberOfWheels, engineSizeInLitres);
        this.bikeStyle = bikeStyle;
    }

    public Motorbike(String bikeStyle) {
        this.bikeStyle = bikeStyle;
    }

    public Motorbike() {
    }

    public String getBikeStyle() {
        return bikeStyle;
    }

    public void setBikeStyle(String bikeStyle) {
        this.bikeStyle = bikeStyle;
    }

    @Override
    public String toString() {
        return "Motorbike Style = " + bikeStyle;
    }
}
