import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double movieBudget = Double.parseDouble(scan.nextLine());
        int StatistCount = Integer.parseInt(scan.nextLine());
        double dressPrice = Double.parseDouble(scan.nextLine());

        double sum = 0;
        double decor = movieBudget * 0.1;
        double dressTotal = StatistCount * dressPrice;
        if (StatistCount > 150) {
            dressTotal = dressTotal - (dressTotal * 0.1);
        }
        sum = decor + dressTotal;
        double diff =  Math.abs(movieBudget - sum);
        if (movieBudget >= sum) {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.",diff);
        } else {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", diff);
        }

    }
}
