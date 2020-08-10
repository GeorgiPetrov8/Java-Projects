package Vehicles;

import java.text.DecimalFormat;

public class Truck extends Vehicle {
    public Truck(double fuelQuantity, double litersPerKm, double tankCapacity) {
        super(fuelQuantity, litersPerKm, tankCapacity);
    }

    @Override
    public void drive(double distance) {
        double litresToRemove = (super.getFuelConsumption() + 1.6) * distance;
        if (litresToRemove <= super.getFuelQuantity()) {
            super.setFuelQuantity(super.getFuelQuantity() - litresToRemove);
            System.out.printf("Vehicles.Truck travelled %s km%n", new DecimalFormat("#.##").format(distance));
        } else {
            System.out.println("Vehicles.Truck needs refueling");
        }
    }

    @Override
    public void refueled(double liters) {
        if (liters <= super.getTankCapacity()) {
            if (liters > 0) {
                super.setFuelQuantity(super.getFuelQuantity() + liters * 0.95);
            } else {
                System.out.println("Fuel must be a positive number");
            }
        } else {
            System.out.println("Cannot fit fuel in tank");
        }
    }
}
