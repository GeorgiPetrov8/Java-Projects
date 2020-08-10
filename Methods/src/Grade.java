import java.util.Scanner;

public class Grade {

    private static void printResult(double result) {
        if (result >= 2.00 && result < 3.00) {
            System.out.println("Fail");
        } else if (result >= 3.00 && result < 3.50) {
            System.out.println("Poor");
        } else if (result >= 3.50 && result < 4.50) {
            System.out.println("Good");
        } else if (result >= 4.50 && result < 5.50) {
            System.out.println("Very good");
        } else if (result >= 5.50 && result <= 6.00) {
            System.out.println("Excellent");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double grade = Double.parseDouble(scan.nextLine());

        printResult(grade);
    }
}

