import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());
        printResult(a , b);
    }
    private static void printResult(int a , int b) {
        int aFactorial = 1;
        int bFactorial = 1;
        for (int i = 2; i <= a ; i++) {
            aFactorial *= i;

        }
        for (int i = 2; i <= b ; i++) {
            bFactorial *= i;

        }
        int result = aFactorial / bFactorial;
        System.out.printf("%.2f",(double)result);

    }
}
