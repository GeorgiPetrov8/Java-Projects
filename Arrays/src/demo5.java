import java.util.Scanner;

public class demo5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(" ");
        int[] numbers = new int[input.length];

        int sumOfEvens = 0;
        int sumOfOdds = 0;

        for (int i = 0; i <numbers.length ; i++) {
            numbers[i]=Integer.parseInt(input[i]);
            if (numbers[i] % 2==0) {
                sumOfEvens+=numbers[i];
            }else {
                sumOfOdds+=numbers[i];
            }


        }
        int result = sumOfEvens - sumOfOdds;
        System.out.println(result);

    }
}
