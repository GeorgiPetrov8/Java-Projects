import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HandsOfCards {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, Integer> output = new LinkedHashMap<>();

       //Map<String, Set<String>> !!!

        String input = "";
        while (!(input=scan.nextLine()).equals("JOKER")) {
            String[] tokens = input.split(" ");

            String player = tokens[0];
            int score = 0;
            for (int i = 1; i < tokens.length; i++) {
                String card = tokens[i];

                int points = 0;
                if (card.charAt(0) == 'J') {
                    points += 11;
                } else if (card.charAt(0) == 'Q') {
                    points += 12;
                } else if (card.charAt(0) == 'K') {
                    points += 13;
                } else if (card.charAt(0) == 'A') {
                    points += 14;
                } else {
                    points += card.charAt(0);
                }

                if (card.charAt(1) == 'S') {
                    points = points * 4;
                } else if (card.charAt(1) == 'H') {
                    points = points * 3;
                } else if (card.charAt(1) == 'D') {
                    points = points * 2;
                }


                score += points;
            }

            output.putIfAbsent(player, 0);
            output.put(player, output.get(player) + score);

        }

        for (Map.Entry<String, Integer> entry : output.entrySet()) {
            System.out.println(String.format("%s %d",entry.getKey(), entry.getValue()));
        }

    }
}
