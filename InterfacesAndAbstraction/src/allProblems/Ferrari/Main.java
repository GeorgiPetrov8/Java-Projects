package allProblems.Ferrari;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Car car = new Ferrari(scan.nextLine());
        System.out.println(car);
    }
}
