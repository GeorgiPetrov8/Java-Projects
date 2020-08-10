import java.util.Arrays;
import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int[] train = new int[n];

        int sum = 0;

        for (int i = 0; i <n ; i++) {
            train[i]=Integer.parseInt(scan.nextLine());
            sum += train[i];

        }
        for (int wagon : train) {
            System.out.print(wagon + " ");
        }
        System.out.println();
        System.out.println(sum);

    }
}