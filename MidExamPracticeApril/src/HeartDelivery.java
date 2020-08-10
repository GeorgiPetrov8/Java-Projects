import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HeartDelivery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> inputList =
                Arrays
                        .stream(scan.nextLine().split("\\@"))
                        .map(Integer::parseInt).collect(Collectors.toList());

        String command = scan.nextLine();
        int lastPositionIndex = 0;
        while (!command.equals("Love!")) {
            String[] tokens = command.split("\\s+");
            String string = tokens[0];
            int size = Integer.parseInt(tokens[1]);

            int currentIndex = lastPositionIndex + size;
            if (currentIndex <= inputList.size() - 1) {
               int value = inputList.get(currentIndex);
               int newValue = value - 2;
               if (value == 0) {
                   System.out.printf("Place %d already had Valentine's day.%n", currentIndex);
                   lastPositionIndex = currentIndex;

               }
               else if (newValue == 0) {
                   System.out.printf("Place %d has Valentine's day.%n", currentIndex);
                   inputList.set(currentIndex, newValue);
                   lastPositionIndex = currentIndex;

               } else {
                   lastPositionIndex = currentIndex;
                   inputList.set(currentIndex, newValue);
               }


            } else {
                currentIndex = 0;
                int value = inputList.get(currentIndex);
                int newValue = value - 2;
                if (value == 0) {
                    System.out.printf("Place %d already had Valentine's day.%n", currentIndex);
                    lastPositionIndex = currentIndex;

                }
                else if (newValue == 0) {
                    System.out.printf("Place %d has Valentine's day.%n", currentIndex);
                    inputList.set(currentIndex, newValue);
                    lastPositionIndex = currentIndex;

                } else {
                    lastPositionIndex = currentIndex;
                    inputList.set(currentIndex, newValue);
                }

            }

            command = scan.nextLine();
        }
        System.out.printf("Cupid's last position was %d.%n", lastPositionIndex);
        int places = 0;
        for (Integer house : inputList) {
            if (house != 0) {
                places++;
            }
        }
        if (places == 0) {
            System.out.println("Mission was successful.");
        } else {
            System.out.printf("Cupid has failed %d places.", places);
        }
    }
}
//Working! 100/100