import java.util.Scanner;

public class ReverseOrder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n =Integer.parseInt(scan.nextLine());//3

        int[] numbers = new int[n];//3 (0,1,2)

        for (int i = 0; i <n ; i++) {
            int number = Integer.parseInt(scan.nextLine());
            numbers[i] = number;


        }
        for (int i = numbers.length - 1; i >=0 ; i--) {
            System.out.print(numbers[i] + " ");

        }

    }
}
