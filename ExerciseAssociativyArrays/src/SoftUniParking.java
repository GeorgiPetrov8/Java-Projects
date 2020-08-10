import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        LinkedHashMap<String, String> registeredCars = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] tokens = scan.nextLine().split("\\s+");
            String command = tokens[0];
            String name = tokens[1];
            switch (command) {
                case "register":
                    String carNumber = tokens[2];
                    if (registeredCars.containsKey(name) || registeredCars.containsValue(carNumber)) {
                        System.out.println(String.format("ERROR: already registered with plate number %s", carNumber));
                    } else {
                            registeredCars.put(name, carNumber);
                            System.out.println(String.format("%s registered %s successfully", name, carNumber));
                    }
                    break;
                case "unregister":
                    if (!registeredCars.containsKey(name)) {
                        System.out.println(String.format("ERROR: user %s not found", name));
                    } else {
                        registeredCars.remove(name);
                        System.out.println(String.format("%s unregistered successfully", name));
                    }
                    break;


            }

        }
        for (
                Map.Entry<String, String> entry : registeredCars.entrySet()) {
            System.out.println(String.format("%s => %s", entry.getKey(), entry.getValue()));

        }
    }
}
