import java.util.Scanner;

public class CircleAreaandPerimeter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double r = Double.parseDouble(scan.nextLine());

        System.out.println("Area = " + Math.PI * r * r);
        System.out.println("Perimeter = " + 2 * Math.PI * r);

    }
}
