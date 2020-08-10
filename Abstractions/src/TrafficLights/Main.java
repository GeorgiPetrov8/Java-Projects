package TrafficLights;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] inputLights = scan.nextLine().split("\\s+");
        int n = Integer.parseInt(scan.nextLine());
        TrafficLights[] trafficLights = TrafficLights.values();

        for (int row = 0; row < n ; row++) {
            for (int i = 0; i < inputLights.length ; i++) {
                int index = TrafficLights.valueOf(inputLights[i]).ordinal() + 1;
                if (index > 2) {
                    index = 0;
                }

                inputLights[i] = trafficLights[index].toString();
                System.out.print(inputLights[i] + " ");

            }
            System.out.println();
        }
    }
}
