package CardRank;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        System.out.println("CardsWihtPower.Card Ranks:");
        CardRanks[] cardRanks = CardRanks.values();
        for (CardRanks rank : cardRanks) {
            System.out.printf("Ordinal value: %d; Name value: %s%n",rank.ordinal(),rank);
        }
    }
}
