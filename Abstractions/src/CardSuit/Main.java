package CardSuit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        System.out.println(input + ":");

        CardSuit[] cardSuits = CardSuit.values();
        for (CardSuit suit : cardSuits) {
            System.out.printf("Ordinal value: %d; Name value: %s%n",suit.ordinal(),suit);
        }
    }
}
