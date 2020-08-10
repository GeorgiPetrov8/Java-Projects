package JediGalaxy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = readArray(scanner.nextLine());
        int rows = dimensions[0];
        int cols = dimensions[1];
        Field field = new Field(rows, cols);

        String command = scanner.nextLine();
        while (!command.equals("Let the Force be with you")) {
            Galaxy galaxy = new Galaxy(field);
            int[] startCoordinates = readArray(command);
            int[] evilsStartCoordinates = readArray(scanner.nextLine());
            int jediRow = startCoordinates[0];
            int jediCol = startCoordinates[1];
            int evilRow = evilsStartCoordinates[0];
            int evilCol = evilsStartCoordinates[1];

            galaxy.setEvil(evilRow, evilCol);
            long valueOfStars = galaxy.getValueOfStars(jediRow, jediCol);
            System.out.println(valueOfStars);

            command = scanner.nextLine();
        }
    }

    private static int[] readArray(String command) {
        return Arrays.stream(command.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }

}
