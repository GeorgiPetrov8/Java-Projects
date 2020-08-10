import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MathPotato {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayDeque<String> queue = new ArrayDeque<>(Arrays
                .stream(scan.nextLine()
                        .split("\\s+")).collect(Collectors.toCollection(ArrayDeque::new)));

        int count = Integer.parseInt(scan.nextLine());

        while (queue.size() > 1) {

            for (int i = 1; i < count; i++) {
                queue.offer(queue.poll());

            }

        }
        System.out.println("Last is " + queue.poll());
    }
}
