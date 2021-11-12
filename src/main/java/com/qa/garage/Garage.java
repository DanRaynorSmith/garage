package com.qa.garage;

import com.qa.vehicles.Vehicle;

import java.util.ArrayList;
import java.util.List;


public class Garage {

        List<Vehicle> inGarage = new ArrayList<>();

        public void addVehicle(Vehicle vehicle) {
                inGarage.add(vehicle);
        }

        public double billing(Vehicle vehicle) {

                if (vehicle.getClass().getSimpleName().equals("Car")) {
                        return 550.50;
                } else if (vehicle.getClass().getSimpleName().equals("Motorbike")) {
                        return 250.75;
                } else {
                        return 400;
                }
        }

        public void removeVehicleByClass(String vehicle) {
                inGarage.removeIf(value -> value.getClass().getSimpleName().equals(vehicle));
        }

        public double fixAll() {
                for (Vehicle i : inGarage) {
                        return billing(i);
                }
                return 0;
        }


        public void emptyGarage() {
                inGarage.removeAll(inGarage);
                System.out.println("Garage emptied");
        }

}
