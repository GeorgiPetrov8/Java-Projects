import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Stack;

public class ParkingLot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

       LinkedHashSet<String> carsRegistrations = new LinkedHashSet<>();

       String input = "";
       while (!(input = scan.nextLine()).equals("END")) {
           String direction = input.substring(0, input.indexOf(','));
           String carNumber = input.substring(input.indexOf(',') + 2);

           if (direction.equals("IN")) {
               carsRegistrations.add(carNumber);
           } else if (direction.equals("OUT")) {
               carsRegistrations.remove(carNumber);
           }
       }

       if (carsRegistrations.isEmpty()) {
           System.out.println("Parking Lot is Empty");
       }

        for (String carNum : carsRegistrations) {
            System.out.println(carNum);
        }
    }
}
