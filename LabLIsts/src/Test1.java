import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String values = scan.nextLine();

        List<String> items =
                Arrays
                        .stream(values.split(" "))
                        .collect(Collectors.toList());
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < items.size(); i++) {
            numbers.add(Integer.parseInt(items.get(i)));

        }
//        for (int i = 0; i < numbers.size(); i++) {
//            System.out.println(numbers.get(i));
//        for (Integer number : numbers ) {
//            System.out.print(number + " ");

    }

}

