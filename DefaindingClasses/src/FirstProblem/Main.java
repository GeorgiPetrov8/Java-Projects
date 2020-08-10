package FirstProblem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int n = Integer.parseInt(scan.nextLine());

        while (n-- > 0) {
           String[] tokens = scan.nextLine().split("\\s+");


           if (tokens.length == 1) {
               Car car = new Car(tokens[0]);
               System.out.println(car.carInfo());
           } else if (tokens.length == 2) {
               Car car = new Car(tokens[0],tokens[1]);
               System.out.println(car.carInfo());
           } else if (tokens.length == 3) {
               Car car = new Car(tokens[0],tokens[1],Integer.parseInt(tokens[2]));
               System.out.println(car.carInfo());
           }


        }

    }
}
