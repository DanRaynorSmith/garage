package com.qa.vehicles;

public class Vehicle {

    private int numberOfWheels;
    private int engineSizeInLitres;

    public Vehicle(int numberOfWheels, int engineSizeInLitres) {
        this.numberOfWheels = numberOfWheels;
        this.engineSizeInLitres = engineSizeInLitres;
    }

    public Vehicle() {
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public int getEngineSizeInLitres() {
        return engineSizeInLitres;
    }

    public void setEngineSizeInLitres(int engineSizeInLitres) {
        this.engineSizeInLitres = engineSizeInLitres;
    }

    @Override
    public String toString() {
        return "Vehicle number of wheels=" + numberOfWheels + ", engine size in litres=" + engineSizeInLitres;
    }
}
