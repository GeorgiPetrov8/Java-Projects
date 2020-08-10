import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class NumberArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String value = scan.nextLine();
        List<String> items = Arrays.stream(value.split(" ")).collect(Collectors.toList());
        List<Integer> listOfNumbers = new ArrayList<>();
        for (int i = 0; i < items.size(); i++) {
            listOfNumbers.add(Integer.parseInt(items.get(i)));
        }
        String command = scan.nextLine();
        while (!"End".equals(command)) {
            String[] tokens = command.split("\\s+");

            switch (tokens[0]) {
                case "Switch":
                    int index = Integer.parseInt(tokens[1]);
                    if (index <= listOfNumbers.size() && index >= 0) {
                        if (listOfNumbers.get(index) >= 0) {
                            int number = -listOfNumbers.get(index);
                            listOfNumbers.set(index,number);
                        }else if (listOfNumbers.get(index) < 0){
                            int number = Math.abs(listOfNumbers.get(index));
                            listOfNumbers.set(index,number);
                        }
                    }
                    break;
                case "Change":
                    int index1 = Integer.parseInt(tokens[1]);
                    int value1 = Integer.parseInt(tokens[2]);
                    if (index1 <= listOfNumbers.size()) {
                        listOfNumbers.set(index1,value1);
                    }
                    break;
                case "Sum":
                    if (tokens[1].equals("Negative")) {
                        int sumNegative = 0;
                        for (int i = 0; i < listOfNumbers.size() ; i++) {
                            int currentNum = listOfNumbers.get(i);
                            if (currentNum < 0) {
                                sumNegative += currentNum;
                            }
                        }
                        System.out.println(sumNegative);
                    }else if (tokens[1].equals("Positive")) {
                        int sumPositive = 0;
                        for (int i = 0; i <listOfNumbers.size() ; i++) {
                            int currentNum = listOfNumbers.get(i);
                            if (currentNum >= 0) {
                                sumPositive += currentNum;
                            }
                        }
                        System.out.println(sumPositive);
                    }else if (tokens[1].equals("All")) {
                        int sumAll = 0;
                        for (int number : listOfNumbers) {
                            sumAll += number;
                        }
                        System.out.println(sumAll);
                    }
                    break;
            }
            command = scan.nextLine();


        }
        for (int number : listOfNumbers) {
            if (number >= 0)
            System.out.print(number + " ");

        }
    }
}
