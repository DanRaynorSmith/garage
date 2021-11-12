package com.qa.main;

import com.qa.garage.Garage;
import com.qa.vehicles.Car;
import com.qa.vehicles.Motorbike;
import com.qa.vehicles.Van;
import com.qa.vehicles.Vehicle;

public class Runner {
    public static void main(String[] args) {

        Garage myGarage = new Garage();

        Vehicle customerCar = new Car(4, 6, "Ford");
        Vehicle customerBike = new Motorbike(2, 2, "Bomber");
        Vehicle otherCustomerBike = new Motorbike(2, 1, "Dirt bike");
        Vehicle customerVan = new Van(4, 2, 2000);

        myGarage.addVehicle(customerCar);
        myGarage.addVehicle(customerBike);
        myGarage.addVehicle(otherCustomerBike);
        myGarage.addVehicle(customerVan);

        System.out.println(myGarage.billing(customerBike));

        System.out.println(myGarage.fixAll());

        myGarage.emptyGarage();
        System.out.println(customerBike);
    }
}
