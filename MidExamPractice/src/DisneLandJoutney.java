import java.util.Scanner;

public class DisneLandJoutney {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int price = Integer.parseInt(scan.nextLine());
        int months = Integer.parseInt(scan.nextLine());

        double sum = price * 0.25;
        if (months > 0 && price >0) {
            for (int i = 2; i <= months; i++) {
                if (i % 2 != 0) {
                    double moneyForCloths = sum * 0.16;
                    sum = sum - moneyForCloths;
                }
                if (i % 4 ==0) {
                    sum = sum + (sum * 0.25);
                }
                double saveMoney = price * 0.25;
                sum += saveMoney;
            }
            if (sum >= price) {
                double moneyForSouvenirs = sum - price;
                System.out.printf("Bravo! You can go to Disneyland and you will have %.2flv. for souvenirs.", moneyForSouvenirs);
            } else if (price > sum) {
                double moneyNeeded = price - sum;
                System.out.printf("Sorry. You need %.2flv. more.", moneyNeeded);
            }
        }
    }
}
