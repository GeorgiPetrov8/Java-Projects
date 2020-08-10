import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(" ");
        int[] numbers = new int[input.length];// 1 4 3 2

        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }

        for (int i = 0; i < numbers.length - 1; i++) {// 4
            int currentNum = numbers[i];// 1
            boolean isTop = true;
            for (int j = i + 1; j < numbers.length; j++) {
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
