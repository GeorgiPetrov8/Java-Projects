import java.text.DecimalFormat;
import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = Double.parseDouble(scan.nextLine());
        String operation = scan.nextLine();
        double b = Double.parseDouble(scan.nextLine());

        if (printResult(a,operation,b) % 1 ==0 ) {
            System.out.printf("%.0f",printResult(a,operation,b));
        }else {
            System.out.printf("%.2f",printResult(a,operation,b));
        }
        //System.out.println(new DecimalFormat("0.###").format(printResult(a,operation,b)));
    }

    private static double printResult(double a, String operation, double b) {
        double result = 0.0;

        switch (operation) {
            case "/" :
                result = a / b;
                break;
            case "*" :
                result = a * b;
                break;
            case "+" :
                result = a + b;
                break;
            case "-" :
                result = a - b;
                break;
        }
        return result;
    }
}
