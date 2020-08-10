import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(" ");
        int[] numbers = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }

        for (int i = 0; i < input.length - 1 ; i++) {
            int currentNum = numbers[i] ;
            boolean isTop = true;
            for (int j = i + 1; j < input.length; j++) {
                if (currentNum <= numbers[j]) {
                    isTop = false;
                    break;

                }

            }
            if (isTop) {
                System.out.print(currentNum + " ");
            }

        }
        System.out.println(numbers[numbers.length - 1]);

    }
}
