import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LIstManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        List<String> listInput =
                Arrays
                        .stream(input.split(" "))
                        .collect(Collectors.toList());
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < listInput.size(); i++) {
            numbers.add(Integer.parseInt(listInput.get(i)));

        }
        while (true) {
            String token = scan.nextLine();
            if (token.equals("end")) {
                break;
            }
            String[] tokens = token.split(" ");
            switch (tokens[0]) {
                case "Contains":
                    int number = Integer.parseInt(tokens[1]);
                    if (numbers.contains(number)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    String evenOrOdd = tokens[1];
                    if (evenOrOdd.equals("even")) {
                        for (int i = 0; i < numbers.size(); i++) {
                            if (numbers.get(i) % 2 == 0) {
                                System.out.print(numbers.get(i) + " ");
                            }
                        }
                        System.out.println();
                    }else if (evenOrOdd.equals("odd")) {
                        for (int i = 0; i < numbers.size() ; i++) {
                            if (numbers.get(i) % 2 != 0) {
                                System.out.print(numbers.get(i) + " ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "Get":
                    String indexTwo = tokens[1];
                    if (indexTwo.equals("sum")) {
                        int sum = 0;
                        for (Integer num : numbers) {
                            sum += num;
                        }
                        System.out.println(sum);
                    }
                    break;
                case "Filter":
                    String sim = tokens[1];
                    int num = Integer.parseInt(tokens[2]);
                    switch (sim) {
                        case "<":
                            for (int i = 0; i <= numbers.size() - 1; i++) {
                                if (numbers.get(i) < num)
                                System.out.print(numbers.get(i) + " ");
                            }
                            System.out.println();
                            break;
                        case ">":
                            for (int i = 0; i <= numbers.size() - 1; i++) {
                                if (numbers.get(i) > num)
                                System.out.print(numbers.get(i) + " ");
                            }
                            System.out.println();
                            break;
                        case ">=":
                            for (int i = 0; i <= numbers.size() - 1; i++) {
                                if (numbers.get(i) >= num)
                                System.out.print(numbers.get(i) + " ");
                            }
                            System.out.println();
                            break;
                        case "<=":
                            for (int i = 0; i <= numbers.size() - 1; i++) {
                                if (numbers.get(i) <= num)
                                System.out.print(numbers.get(i) + " ");
                            }
                            System.out.println();
                            break;

                    }
                    break;
            }
        }
    }
}
