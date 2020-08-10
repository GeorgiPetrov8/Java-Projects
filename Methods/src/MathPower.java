import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double number = Double.parseDouble(scan.nextLine());
        double power = Double.parseDouble(scan.nextLine());

        System.out.println(new DecimalFormat("0.####").format(mathPower(number,power)));
    }
    private static double mathPower(double num, double power) {
        double result = 1;

        for (int i = 0; i < power ; i++) {
            result *= num;
        }
        return result;
    }
}
