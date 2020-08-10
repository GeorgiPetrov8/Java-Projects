import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    private static void printNumbers(List<Integer> numbersList) {
        for (int number : numbersList) {
            System.out.print(number + " ");

        }

    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String numbers = scan.nextLine();
        List<String> firstList = Arrays
                .stream(numbers.split(" "))
                .collect(Collectors.toList());
        List<Integer> numbersList = new ArrayList<>();
        for (String s : firstList) {
            numbersList.add(Integer.parseInt(s));
        }
        String input = scan.nextLine();
        while (!input.equals("end")) {
            String[] tokens = input.split(" ");
            if (tokens[0].equals("Delete")) {
                int number = Integer.parseInt(tokens[1]);
                if (numbersList.contains(number)) {
                    numbersList.remove(number);
                }
            } else if (tokens[0].equals("Insert")) {
                int number = Integer.parseInt(tokens[1]);
                int position = Integer.parseInt(tokens[2]);
                numbersList.add(position, number);
            }
            input = scan.nextLine();
        }
        printNumbers(numbersList);
    }

}
