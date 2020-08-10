package Vehicles;

import java.text.DecimalFormat;

public class Bus extends Vehicle {

    public Bus(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
    }

    @Override
    public void drive(double distance) {
        double litersToRemove = (super.getFuelConsumption() + 1.4) * distance;
        if (litersToRemove <= super.getFuelQuantity()) {
            super.setFuelQuantity(super.getFuelQuantity() - litersToRemove);
            System.out.printf("Vehicles.Bus travelled %s km%n", new DecimalFormat("0.##").format(distance));
        } else {
            System.out.println("Vehicles.Bus needs refueling");
        }
    }

    public void drive(double distance, boolean driveEmpty) {
        if (driveEmpty) {
            double litersToRemove = super.getFuelConsumption() * distance;
            if (litersToRemove <= super.getFuelQuantity()) {
                super.setFuelQuantity(super.getFuelQuantity() - litersToRemove);
                System.out.printf("Vehicles.Bus travelled %s km%n", new DecimalFormat("0.##").format(distance));
            } else {
                System.out.println("Vehicles.Bus needs refueling");
            }
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
