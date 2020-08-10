package Vehicles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] carInfo = scan.nextLine().split("\\s+");
        String[] truckInfo = scan.nextLine().split("\\s+");
        String[] busInfo = scan.nextLine().split("\\s+");

        Vehicle car = new Car(Double.parseDouble(carInfo[1]),
                Double.parseDouble(carInfo[2]),
                Double.parseDouble(carInfo[3]));
        Vehicle truck = new Truck(Double.parseDouble(truckInfo[1]),
                Double.parseDouble(truckInfo[2]),
                Double.parseDouble(truckInfo[3]));
        Bus bus = new Bus(Double.parseDouble(busInfo[1]),
                Double.parseDouble(busInfo[2]),
                Double.parseDouble(busInfo[3]));


        int n = Integer.parseInt(scan.nextLine());
        while (n-- > 0) {
            String[] tokens = scan.nextLine().split("\\s+");
            switch (tokens[0]) {
                case "Drive":
                    if (tokens[1].equals("Vehicles.Car")) {
                        car.drive(Double.parseDouble(tokens[2]));
                    } else if (tokens[1].equals("Vehicles.Truck")) {
                        truck.drive(Double.parseDouble(tokens[2]));
                    } else {
                        bus.drive(Double.parseDouble(tokens[2]));
                    }
                    break;
                case "Refuel":
                    if (tokens[1].equals("Vehicles.Car")) {
                        car.refueled(Double.parseDouble(tokens[2]));
                    } else {
                        truck.refueled(Double.parseDouble(tokens[2]));
                    }
                    break;
                case "DriveEmpty":
                    bus.drive(Double.parseDouble(tokens[2]),true);
                    break;
            }
        }
        System.out.printf("Vehicles.Car: %.2f%n", car.getFuelQuantity());
        System.out.printf("Vehicles.Truck: %.2f%n", truck.getFuelQuantity());
        System.out.printf("Vehicles.Bus: %.2f", bus.getFuelQuantity());
    }
}
