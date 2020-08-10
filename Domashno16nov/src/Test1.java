import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String geometric = scan.nextLine();

        if ("square".equals(geometric)) {
        double a = Double.parseDouble(scan.nextLine());
        System.out.printf("%.3f",(a * a));
    }   else if ("rectangle".equals(geometric)) {
            double a = Double.parseDouble(scan.nextLine());
            double b = Double.parseDouble(scan.nextLine());
            System.out.printf("%.3f", (a * b));
        } else if ("circle".equals(geometric)) {
            double a = Double.parseDouble(scan.nextLine());
            System.out.printf("%.3f",Math.PI * a * a);
        } else if ("triangle".equals(geometric)) {
            double a = Double.parseDouble(scan.nextLine());
            double b = Double.parseDouble(scan.nextLine());
            System.out.printf("%.3f",(a * b / 2) );
        } else {
            System.out.println("Unknown geometric shape");
        }

        }
}
