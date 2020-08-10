import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] first = scan.nextLine().split(" ");
        String[] second = scan.nextLine().split(" ");

        for (String secElem : second) {
            for (String firstEl : first) {
                if (secElem.equals(firstEl)) {
                    System.out.print(firstEl + " ");
                }
            }

        }
    }
}
