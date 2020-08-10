//package CarsCatalogue;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//import java.util.stream.Collectors;
//
//public class Main {
//
//
//    Scanner scan = new Scanner(System.in);
//
//    List<Vehicle> vehicleList = new ArrayList<>();
//
//    String input = scan.nextLine();
//            while (!"End".equals(input)) {
//        String[] tokens = input.split("\\s+");
//        String type = tokens[0];
//        String model = tokens[1];
//        String color = tokens[2];
//        int hoursPower = Integer.parseInt(tokens[3]);
//
//        Vehicle vehicle = new Vehicle(type, model, color, hoursPower);
//        vehicleList.add(vehicle);
//
//        input = scan.nextLine();
//
//    }
//
//    String model = scan.nextLine();
//            while (!"Close the Catalogue".equals(model)) {
//        String finalModel = model;
//        vehicleList.stream()
//                .filter(vehicle -> vehicle.getModel().equals(finalModel))
//                .forEach(System.out::println);
//        model = scan.nextLine();
//    }
//            System.out.println(String.format("Cars have average horsepower of: %.2f.", average(vehicleList.stream()
//                    .filter(v -> v.getType().equals("car"))
//            .collect(Collectors.toList()))));
//
//
//            System.out.printf("Trucks have average horsepower of: %.2f.%n", average(vehicleList.stream()
//                    .filter(v -> v.getType().equals("truck"))
//            .collect(Collectors.toList())));
//}
//
//    private static double average(List<Vehicle> vehicles) {
//        if (vehicles.size() == 0) {
//            return 0.0;
//        }
//        double sum = 0;
//
//        for (Vehicle vehicle : vehicles) {
//            sum += vehicle.getHorsePower();
//        }
//        return sum / vehicles.size();
//    }
//}
//
//}
