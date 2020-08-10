import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(" ");
        int[] numbers = new int[input.length];// 1 2 3 3


        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);

        }
            int index = -1;
            for (int i = 0; i < input.length; i++) {
                int rightSum = 0;
                int leftSum = 0;

                for (int j = i - 1; j >= 0; j--) {
                    leftSum += numbers[j];

                }
                for (int j = i + 1; j < numbers.length; j++) {
                    rightSum += numbers[j];

                }
                if (leftSum == rightSum) {
                    index = i;
                    break;

                }

            }

            if (index != -1) {
                System.out.println(index);
            } else {
                System.out.println("no");
            }


        }
    }
