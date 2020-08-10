package allProblems.FoodShortage;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, Buyer> people = new HashMap<>();

        int n = Integer.parseInt(scan.nextLine());
        while (n-- > 0) {
            String[] tokens = scan.nextLine().split("\\s+");

            if (tokens.length == 4) {
                String citizenName = tokens[0];
                people.putIfAbsent(citizenName, new Citizen(tokens[0], Integer.parseInt(tokens[1]),
                        tokens[2], tokens[3]));
            } else if (tokens.length == 3) {
                String rebelName = tokens[0];
                people.putIfAbsent(rebelName, new Rebel(tokens[0], Integer.parseInt(tokens[1]),
                        tokens[2]));
            }

        }

        String input;
        while (!(input = scan.nextLine()).equals("End")) {
            String personName = input;
            if (people.containsKey(personName)) {
                people.get(personName).buyFood();
            }
        }

        int totalFood = 0;
        for (Buyer buyer : people.values()) {
            totalFood += buyer.getFood();
        }

        System.out.println(totalFood);
    }

}
