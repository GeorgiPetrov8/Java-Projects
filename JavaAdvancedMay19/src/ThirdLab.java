import java.util.ArrayDeque;
import java.util.Scanner;

public class ThirdLab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        int decimal = Integer.parseInt(scan.nextLine());
        while (decimal != 0) {
            stack.push(decimal % 2);
            decimal = decimal / 2;
        }

        if (stack.isEmpty()) {
            System.out.println(0);
        } else {
            for (int number : stack) {
                System.out.print(number);
            }
        }
    }
}
