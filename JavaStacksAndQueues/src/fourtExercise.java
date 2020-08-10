import java.util.ArrayDeque;
        import java.util.Arrays;
        import java.util.Collections;
        import java.util.Scanner;

public class fourtExercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayDeque<Integer> queue = new ArrayDeque<>();

        int[] commands = Arrays.stream(scan.nextLine().split("\\s+")).
                mapToInt(Integer::parseInt).toArray();

        int[] numbers = Arrays.stream(scan.nextLine().split("\\s+")).
                mapToInt(Integer::parseInt).toArray();

        int numOffer = commands[0];
        int numToPop = commands[1];
        int numToCheck = commands[2];

        for (int i = 0; i < numOffer ; i++) {
            queue.offer(numbers[i]);
        }

        for (int i = 0; i < numToPop ; i++) {
            queue.pop();
        }

        if (queue.isEmpty()) {
            System.out.println(0);
        } else if (queue.contains(numToCheck)) {
            System.out.println("true");
        } else {
            System.out.println(Collections.min(queue));
        }

    }
}
