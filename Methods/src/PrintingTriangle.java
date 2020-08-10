import java.util.Scanner;

public class PrintingTriangle {

    private static void printLIne(int star , int end) {
        for (int i = star; i <= end ; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            printLIne(1, i);

        }

        printLIne(1, n);

        for (int i = n - 1; i >= 1; i--) {
            printLIne(1, i);

        }
    }
}
