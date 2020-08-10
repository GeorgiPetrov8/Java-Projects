import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> listOfNumbers = Arrays
                .stream(scan.nextLine().split(" "))
                .collect(Collectors.toList());

        String input = scan.nextLine();
        while (!input.equals("End")) {
            String[] tokens = input.split(" ");
            String currentIndex = tokens[0];
            switch (currentIndex) {
                case "Add":
                    String numberAtEnd = tokens[1];
                    listOfNumbers.add(listOfNumbers.size(), numberAtEnd);
                    break;
                case "Insert":
                    String number = tokens[1];
                    int indexIn = Integer.parseInt(tokens[2]);
                    if (indexIn >= 0 && indexIn <= listOfNumbers.size()) {
                        listOfNumbers.add(indexIn, number);
                    }else
                        System.out.println("Invalid index");
                    break;
                case "Remove":
                    int index =Integer.parseInt(tokens[1]);
                    if (index >= 0 && index <= listOfNumbers.size()) {
                        listOfNumbers.remove(index);
                    } else
                        System.out.println("Invalid index");
                    break;
                case "Shift":
                    String side = tokens[1];
                    int count = Integer.parseInt(tokens[2]);
                    if (side.equals("left")) {
                        for (int i = 0; i < count; i++) {
                            String temp = listOfNumbers.get(0);
                            for (int j = 0; j < listOfNumbers.size() - 1; j++) {
                                String nextElement= listOfNumbers.get(j+1);
                                listOfNumbers.set(j,nextElement);
                            }
                            listOfNumbers.set(listOfNumbers.size() - 1,temp);
                        }
                    } else if (side.equals("right")) {
                        for (int i = 0; i < count; i++) {
                            String temp = listOfNumbers.get(listOfNumbers.size() - 1);
                            for (int j =  listOfNumbers.size() - 1; j > 0 ; j--) {
                                String nextNumber = listOfNumbers.get(j - 1);
                                listOfNumbers.set(j,nextNumber);
                            }
                            listOfNumbers.set(0,temp);
                        }

                    }
                    break;

            }
            input = scan.nextLine();
        }
        System.out.println(String.join(" ",listOfNumbers));
    }
}
