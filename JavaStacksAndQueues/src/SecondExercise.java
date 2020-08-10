import java.util.ArrayDeque;
import java.util.Scanner;

public class SecondExercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        String[] operations = scan.nextLine().split("\\s+");
        String[] numbers = scan.nextLine().split("\\s+");

        int pushNumber = Integer.parseInt(operations[0]);
        int popNumber = Integer.parseInt(operations[1]);
        int numberToCheck = Integer.parseInt(operations[2]);

        if (pushNumber <= numbers.length) {

            for (int i = 0; i < pushNumber ; i++) {
                int currentNum = Integer.parseInt(numbers[i]);
                stack.push(currentNum);
            }

        }

        if (popNumber <= numbers.length) {

            for (int i = 0; i < popNumber ; i++) {
                stack.pop();
            }

        }

        if (stack.isEmpty()) {
            System.out.println(0);
        } else if (stack.contains(numberToCheck)) {
            System.out.println("true");
        } else {

            int smallestNumber = Integer.MAX_VALUE;
            for (int i = 0; i < stack.size() ; i++) {
                int currentNum = stack.pop();
                if (currentNum < smallestNumber) {
                    smallestNumber = currentNum;
                }
            }

            System.out.println(smallestNumber);
        }

    }
}
// Moje i po dobra implementaciq!!