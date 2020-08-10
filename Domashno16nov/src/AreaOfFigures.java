

import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String geometricShape = scanner.nextLine().toLowerCase();

        if ("square".equals(geometricShape)) {
            double side = Double.parseDouble(scanner.nextLine());
            System.out.printf("%.3f%n", (side * side));
        } else if ("rectangle".equals(geometricShape)) {
            double length = Double.parseDouble(scanner.nextLine());
            double width = Double.parseDouble(scanner.nextLine());
            System.out.printf("%.3f%n", (length * width));
        } else if ("circle".equals(geometricShape)) {
            double radius = Double.parseDouble(scanner.nextLine());
            System.out.printf("%.3f%n", (Math.PI * radius * radius));
        } else if ("triangle".equals(geometricShape)) {
            double base = Double.parseDouble(scanner.nextLine());
            double hight = Double.parseDouble(scanner.nextLine());
            System.out.printf("%.3f%n", (base * hight / 2));
        } else {
            System.out.println("Unknown geometric shape.");
        }
    }
}