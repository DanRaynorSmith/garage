package com.qa.vehicles;

public class Car extends Vehicle{

    private String make;

    public Car(int numberOfWheels, int engineSizeInLitres, String make) {
        super(numberOfWheels, engineSizeInLitres);
        this.make = make;
    }

    public Car(String make) {
        this.make = make;
    }

    public Car() {
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    @Override
    public String toString() {
        return "Car make = " + make ;
    }
}
