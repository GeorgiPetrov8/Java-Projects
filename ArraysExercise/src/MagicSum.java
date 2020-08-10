import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(" ");
        int[] numbers = new int[input.length];
        int sumResult = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }

        for (int i = 0; i < numbers.length - 1; i++) {
            int currentIndex = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                if (currentIndex + numbers[j] == sumResult) {
                    System.out.println(currentIndex + " " + numbers[j]);
                }

            }

        }

    }
}
