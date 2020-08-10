package CardsWihtPower;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String cardRank = scan.nextLine();
        String suitType = scan.nextLine();
        int cardPower = RankPowers.valueOf(cardRank).getValue() + SuitPowers.valueOf(suitType).getValue();
        String cardName = String.format("%s of %s",cardRank,suitType);

        Card card = new Card(cardPower,cardName);
        System.out.println(card);

    }
}
