package CarSalesman;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        List<Engine> allEngines = new ArrayList<>();
        List<Car> allCars = new ArrayList<>();
        int n = Integer.parseInt(bf.readLine());
        while (n-- > 0) {
            String[] tokens = bf.readLine().split("\\s+");

            String model = tokens[0];
            String power = tokens[1];

            try {
                String displacement = tokens[2];
                String efficiency = tokens[3];
                Engine engine = new Engine(model, power, displacement, efficiency);
                allEngines.add(engine);
            } catch (IndexOutOfBoundsException exception) {
                try {
                    String disOreEff = tokens[2];
                    Engine engine = new Engine(model, power, disOreEff);
                    allEngines.add(engine);
                } catch (IndexOutOfBoundsException exception1) {
                    Engine engine = new Engine(model,power);
                    allEngines.add(engine);
                }
            }


        }

        int m = Integer.parseInt(bf.readLine());
        while (m-- > 0) {
            String[] tokens = bf.readLine().split("\\s+");

            String carModel = tokens[0];
            String engineModel = tokens[1];


            try {
                String weight = tokens[2];
                String color = tokens[3];
                for (Engine engine : allEngines) {
                    if (engine.getModel().equals(engineModel)) {
                        Car car = new Car(carModel, engine, weight, color);
                        allCars.add(car);
                    }
                }

            } catch (IndexOutOfBoundsException exception) {
                try {
                    String weightOreColor = tokens[2];
                    for (Engine engine : allEngines) {
                        if (engine.getModel().equals(engineModel)) {
                            Car car = new Car(carModel, engine, weightOreColor);
                            allCars.add(car);
                        }
                    }
                } catch (IndexOutOfBoundsException exception1) {
                    for (Engine engine : allEngines) {
                        if (engine.getModel().equals(engineModel)) {
                            Car car = new Car(carModel, engine);
                            allCars.add(car);
                        }
                    }
                }
            }

        }

        for (Car car : allCars) {
            System.out.println(car.toString());
        }
    }
}
