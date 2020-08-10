import java.util.Scanner;

public class ConvertMetersToKIlometers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = Integer.parseInt(scan.nextLine());
        double km = m / 1000.00;
        System.out.print(String.format("%.2f",km));
    }
}
