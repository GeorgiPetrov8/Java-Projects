import java.util.Scanner;

public class exersice3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        System.out.println("Enter the number:");
        int min = Integer.MAX_VALUE;
        for (int i = 1; i <= n ; i++) {
            int num = Integer.parseInt(scan.nextLine());

            if (num < min) {
                min = num;
            }

        }
        System.out.println("min = " + min);
    }
}
