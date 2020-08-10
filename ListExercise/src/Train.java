import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String numbers = scan.nextLine();
        List<String> stringList = Arrays
                .stream(numbers.split(" "))
                .collect(Collectors.toList());
        List<Integer> train = new ArrayList<>();
        for (String s : stringList) {
            train.add(Integer.parseInt(s));
        }
        int maxCapacity = Integer.parseInt(scan.nextLine());
        String input = scan.nextLine();
        while (!input.equals("end")) {
            String[] tokens = input.split(" ");
            if (tokens[0].equals("Add")) {
                int people = Integer.parseInt(tokens[1]);
                train.add(people);
            } else {
                int people = Integer.parseInt(tokens[0]);
                for (int i = 0; i < train.size() ; i++) {
                    int currentWagon = train.get(i);
                    int wagonCount = currentWagon + people;
                    if (wagonCount <= maxCapacity) {
                        train.set(i ,wagonCount);
                        break;
                    }

                }
            }
            input = scan.nextLine();
        }
        printTrain(train);


    }

    private static void printTrain(List<Integer> train) {
        for (int wagon : train) {
            System.out.print(wagon + " ");

        }
    }
}
