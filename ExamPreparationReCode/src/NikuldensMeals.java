import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

public class NikuldensMeals {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        TreeMap<String , List<String>> likedMeals = new TreeMap<>();

        int unlikeMeals = 0;

        String input = scan.nextLine();
        while (!input.equals("Stop")) {
            String[] tokens = input.split("-");
            switch (tokens[0]) {
                case "Like":
                    String guest = tokens[1];
                    String meal = tokens[2];
                    likedMeals.putIfAbsent(guest, new ArrayList<>());
                    if (!likedMeals.get(guest).contains(meal)) {
                        likedMeals.get(guest).add(meal);
                    }
                    break;
                case "Unlike":
                    String guestName = tokens[1];
                    String currentMeal = tokens[2];
                    if (!likedMeals.containsKey(guestName)) {
                        System.out.println(String.format("%s is not at the party.", guestName));
                    } else if (!likedMeals.get(guestName).contains(currentMeal)) {
                        System.out.println(String.format("%s doesn't have the %s in his/her collection.",
                                guestName, currentMeal));
                    } else {
                        likedMeals.get(guestName).remove(currentMeal);
                        System.out.println(String.format("%s doesn't like the %s.",guestName, currentMeal));
                        unlikeMeals++;
                    }
                    break;
            }
            input = scan.nextLine();
        }
        likedMeals.entrySet().stream()
                .sorted((g1, g2) -> Integer.compare(g2.getValue().size(), g1.getValue().size()))
                .forEach(k -> System.out.println(String.format("%s: %s", k.getKey(), k.getValue()
                        .toString().replaceAll("[\\[\\]]", ""))));

        System.out.printf("Unliked meals: %d%n", unlikeMeals);
    }
}
//Working 100/100!!!