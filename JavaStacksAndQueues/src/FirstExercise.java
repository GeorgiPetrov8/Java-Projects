import java.util.ArrayDeque;
import java.util.Scanner;

public class FirstExercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

      ArrayDeque<Integer> stack1 = new ArrayDeque<>();

      String[] numbers = scan.nextLine().split("\\s+");

        for (int i = 0; i < numbers.length; i++) {
            int number = Integer.parseInt(numbers[i]);
            stack1.push(number);
        }

        while (!stack1.isEmpty()) {
            System.out.print(stack1.poll() + " ");
        }

    }
}
