import java.util.Scanner;

public class WeddingParty {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberOfGuests = Integer.parseInt(scan.nextLine());
        int budget = Integer.parseInt(scan.nextLine());

        int covertPrice = 20 * numberOfGuests;

        if (covertPrice < budget) {

            int moneyForFireworks = (int) Math.floor((budget - covertPrice) * 0.40);
            int moneyForGiving = (budget - covertPrice) - moneyForFireworks;
            System.out.printf("Yes! %d lv are for fireworks and %d lv are for donation.", moneyForFireworks, moneyForGiving);

        }else if (covertPrice == budget) {
            System.out.println("Yes! 0 lv are for fireworks and 0 lv are for donation.");

        } else {
            int moneyNeeded = covertPrice - budget;
            System.out.printf("They won't have enough money to pay the covert. They will need %d lv more.", moneyNeeded);

        }


    }

}

