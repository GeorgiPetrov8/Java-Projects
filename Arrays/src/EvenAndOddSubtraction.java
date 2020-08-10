import java.util.Scanner;

public class EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(" ");
        int[] numbers = new int[input.length];
        int sumEven=0;
        int sumOdd=0;
        for (int i = 0; i <input.length ; i++) {
            numbers[i]=Integer.parseInt(input[i]);

        }
        for (int number : numbers) {
            if (number % 2==0){
                sumEven+=number;
            }else
                sumOdd+=number;
        }
        System.out.println(sumEven - sumOdd);
    }
}
