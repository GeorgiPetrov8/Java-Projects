import java.util.*;

public class Problem7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, Set<String>> mapCards = new LinkedHashMap<>();

        String input = "";
        while (!(input = scan.nextLine()).equals("JOKER")) {
            String[] tokens = input.split(": ");

            String player = tokens[0];
            String[] cards = tokens[1].split(", ");

            mapCards.putIfAbsent(player, new LinkedHashSet<>());

            for (String card : cards) {
                mapCards.get(player).add(card);
            }
        }

        mapCards.forEach((k,v) -> {
            int totalPoints = 0;
            for (String card : v) {
            totalPoints += getCard(card.substring(0,card.length() - 1))
                    * getMultiply(card.substring(card.length() -1));

            }
            System.out.printf("%s: %d%n",k,totalPoints);
        });

    }

    public static int getCard(String card) {
        switch (card) {
            case "2":
                return 2;
            case "3":
                return 3;
            case "4":
                return 4;
            case "5":
                return 5;
            case "6":
                return 6;
            case "7":
                return 7;
            case "8":
                return 8;
            case "9":
                return 9;
            case "10":
                return 10;
            case "J":
                return 11;
            case "Q":
                return 12;
            case "K":
                return 13;
            case "A":
                return 14;
            default: return 0;
        }
    }

    public static int getMultiply (String multiply) {
        switch (multiply) {
            case "S":
                return 4;
            case "H":
                return 3;
            case "D":
                return 2;
            case "C":
                return 1;
            default: return 0;
        }
    }
}
