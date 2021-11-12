package com.qa.vehicles;

public class Van extends Vehicle {

    private int carryCapacity;

    public Van(int numberOfWheels, int engineSizeInLitres, int carryCapacity) {
        super(numberOfWheels, engineSizeInLitres);
        this.carryCapacity = carryCapacity;
    }

    public Van(int carryCapacity) {
        this.carryCapacity = carryCapacity;
    }

    public Van() {
    }

    public int getCarryCapacity() {
        return carryCapacity;
    }

    public void setCarryCapacity(int carryCapacity) {
        this.carryCapacity = carryCapacity;
    }

    @Override
    public String toString() {
        return "Van carry capacity = " + carryCapacity;
    }
}
