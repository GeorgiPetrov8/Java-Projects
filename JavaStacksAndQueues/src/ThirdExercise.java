import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class ThirdExercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        int count = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < count ; i++) {
            int number = scan.nextInt();

            if (number == 1) {
                stack.push(scan.nextInt());
            } else if (number == 2) {
                stack.pop();
            } else if (number == 3) {
                System.out.println(Collections.max(stack));
            }
        }

    }
}
