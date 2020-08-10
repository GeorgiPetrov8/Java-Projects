import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class GaussTrick {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        String[] split = line.split(" ");

        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < split.length; i++) {
            int number = Integer.parseInt(split[i]);

            numbers.add(number);
        }
        for (int i = 0; i < numbers.size() / 2; i++) {
            int result = numbers.get(i) + numbers.get(numbers.size() - 1 - i);
            System.out.print(result + " ");


        }
        if (numbers.size() % 2 != 0) {
            System.out.print(numbers.get(numbers.size() / 2));
        }
    }
}
