import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HeartDelivery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split("\\@");
        List<Integer> houses = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            houses.add(Integer.parseInt(input[i]));

        }

        String command = scan.nextLine();
        while (!"Love!".equals(command)) {
            String[] tokens = command.split("\\s+");
            int index = Integer.parseInt(tokens[1]);

        }
    }
}
