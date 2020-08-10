package Vehicles;

import java.text.DecimalFormat;

public class Car extends Vehicle {
    public Car(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
    }

    @Override
    public void drive(double distance) {
        double litersToRemove = (super.getFuelConsumption() + 0.9) * distance;
        if (litersToRemove <= super.getFuelQuantity()) {
            super.setFuelQuantity(super.getFuelQuantity() - litersToRemove);
            System.out.printf("Vehicles.Car travelled %s km%n", new DecimalFormat("0.##").format(distance));
        } else {
            System.out.println("Vehicles.Car needs refueling");
        }
    }

    @Override
    public void refueled(double liters) {
        if (liters <= super.getTankCapacity()) {
            if (liters > 0) {
                super.setFuelQuantity(super.getFuelQuantity() + liters);
            } else {
                System.out.println("Fuel must be a positive number");
            }
        } else {
            System.out.println("Cannot fit fuel in tank");
        }
    }
}
