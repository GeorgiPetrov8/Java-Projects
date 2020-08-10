import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Largest3Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> numbers = Arrays
                .stream(scan.nextLine().split("\\s+"))
                .map(Integer::parseInt).sorted((n1,n2) -> n2.compareTo(n1))
                .collect(Collectors.toList());
        int counter = 1;
        for (Integer number : numbers) {
            if (counter <= 3) {
                System.out.print(number + " ");
                counter++;
        }
        }
    }
}
