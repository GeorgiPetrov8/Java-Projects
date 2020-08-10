import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String command = scan.nextLine();
        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());

        switch (command) {
            case "add":
                add(a,b);
                break;
            case "divide":
                divide(a,b);
                break;
            case "subtract":
                subtract(a,b);
                break;
            case "multiply":
                multiply(a,b);
                break;
        }
    }

    private static void multiply(int numA, int numB) {
        System.out.println(numA * numB);
    }

    private static void subtract(int numA, int numB) {
        System.out.println(numA - numB);
    }

    private static void divide(int numA, int numB) {
        System.out.println(numA / numB);
    }

    private static void add(int numA, int numB) {
        System.out.println(numA + numB);
    }
}
