package RawData;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        List<Car> allCars = new ArrayList<>();

        int n = Integer.parseInt(bf.readLine());
        while (n-- > 0) {
            String[] tokens = bf.readLine().split("\\s+");

            String model = tokens[0];
            int engineSpeed = Integer.parseInt(tokens[1]);
            int enginePower = Integer.parseInt(tokens[2]);
            Engine engine = new Engine(engineSpeed, enginePower);

            int cargoWeight = Integer.parseInt(tokens[3]);
            String cargoType = tokens[4];
            Cargo cargo = new Cargo(cargoWeight, cargoType);

            List<Tire> tires = new ArrayList<>();
            for (int i = 5; i < tokens.length; i += 2) {
                double tirePressure = Double.parseDouble(tokens[i]);
                int tireAge = Integer.parseInt(tokens[i + 1]);
                Tire tire = new Tire(tirePressure, tireAge);

                tires.add(tire);
            }
            Car car = new Car(model, engine, cargo, tires);
            allCars.add(car);
        }

        String inputType = bf.readLine();
        if (inputType.equals("fragile")) {
            for (Car car : allCars) {
                String cargoType = car.getCargo().getCargoType();
                int count = 0;
                for (Tire tire : car.getTires()) {
                    if (tire.getTirePressure() < 1) {
                        count++;
                    }
                }
                if (cargoType.equals("fragile") && count > 0) {
                    System.out.println(car.getModel());
                }
            }

        } else if (inputType.equals("flamable")) {
            for (Car car : allCars) {
                String cargoType = car.getCargo().getCargoType();
                int power = car.getEngine().getEnginePower();
                if (cargoType.equals("flamable") && power > 250) {
                    System.out.println(car.getModel());
                }
            }

        }

    }
}
