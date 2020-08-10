import java.util.Scanner;

public class exrecise2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n =Integer.parseInt(scan.nextLine());
        System.out.println("Enter the numbers");
        int max = Integer.MIN_VALUE;
        for (int i = 1; i <= n ; i++) {
            int num = Integer.parseInt(scan.nextLine());

            if (num > max) {
                max = num;
            }

        }
        System.out.println("max = " + max);
    }
}
