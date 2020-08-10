import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String product = scan.nextLine();
       int piece = Integer.parseInt(scan.nextLine());

        printResult(product,piece);
    }

    private static void printResult(String product,int piece) {
        double result = 0;
        switch (product) {
            case "coffee":
                result = piece * 1.50;
                System.out.printf("%.2f",result);
                break;
            case "water":
                result = piece * 1.00;
                System.out.printf("%.2f",result);
                break;
            case "coke":
                result = piece * 1.40;
                System.out.printf("%.2f",result);
                break;
            case "snacks":
                result = piece * 2.00;
                System.out.printf("%.2f",result);
                break;
        }
    }
}
