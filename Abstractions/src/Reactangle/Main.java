package Reactangle;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] coordinates = Arrays.stream(scan.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        Point bottomLeft = new Point(coordinates[0],coordinates[1]);
        Point topRight = new Point(coordinates[2],coordinates[3]);

        Rectangle rectangle = new Rectangle(bottomLeft, topRight);

        int n = Integer.parseInt(scan.nextLine());
        while (n-- > 0) {
            coordinates = Arrays.stream(scan.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();

            int firstPoint = coordinates[0];
            int secondPoint = coordinates[1];

            System.out.println(rectangle.contains(firstPoint, secondPoint));

        }


    }
}
