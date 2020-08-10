import java.util.Scanner;

public class exercise4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("n = ");
        int n = Integer.parseInt(scan.nextLine());
        System.out.println("Enter the numbers");

        int leftSum = 0;
        int rightSum = 0;
        for (int i = 1; i <= n; i++) {
            leftSum = leftSum + scan.nextInt();
        }
        if (leftSum == rightSum) {
            System.out.println("Yes, sum = " + leftSum);
        } else {
            int difference = Math.abs(leftSum - rightSum);
            System.out.println("No, diff = " + difference);
        }
    }
}
