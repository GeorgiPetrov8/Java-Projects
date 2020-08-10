import java.util.Scanner;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(" ");
        int[] numbers = new int[input.length];// 0 1 1 5 2 2 6 3 3


        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }
       int maxCounter = 0;
        int digit = 0;
        int counter = 1;

        for (int i = 1; i < numbers.length ; i++) {
            if (numbers[i] == numbers[i - 1]) {
                counter++;

                if (counter > maxCounter) {
                    maxCounter = counter;
                    digit = numbers[i];
                }
            } else
                counter = 1;
        }
        for (int i = 0; i < maxCounter ; i++) {
            System.out.println(digit + " ");

        }
    }
}

