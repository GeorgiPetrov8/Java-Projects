import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int linesCount = Integer.parseInt(scan.nextLine());
        String regex = "(?:[^@\\-!:>]*)@" +
                "(?<planetName>[A-Z][a-z]+)(?:[^@\\-!:>]*):" +
                "(?<planetPopulation>\\d+)!" +
                "(?<attackType>[AD])!->" +
                "(?<soldierCount>\\d+)(?:[^@\\-!:>]*)";

        Pattern pattern = Pattern.compile(regex);

        List<String> attackedPlanets = new ArrayList<>();
        List<String> destroyedPlanets = new ArrayList<>();

        for (int i = 0; i < linesCount; i++) {
            String input = scan.nextLine();
            int reduce = 0;
            StringBuilder newInput = new StringBuilder();
            for (int j = 0; j < input.length(); j++) {
                char currentIndex = input.charAt(j);
                if (currentIndex == 's' |
                        currentIndex == 't' |
                        currentIndex == 'a' |
                        currentIndex == 'r') {
                    newInput.append(currentIndex);
                    reduce++;
                } else {
                    newInput.append(currentIndex);
                }
            }
            StringBuilder result = new StringBuilder();
            for (int j = 0; j < newInput.length(); j++) {
                char currentChar = newInput.charAt(j);
                result.append(currentChar - reduce);
            }
            Matcher matcher = pattern.matcher(result);
            if (matcher.find()) {
                String planetName = matcher.group("planetName");
                int planetPopulation = Integer.parseInt(matcher.group("planetPopulation"));
                String attackType = matcher.group("attackType");
                int soldiersCount = Integer.parseInt(matcher.group("soldiersCount"));

                if (attackType.equals("A")) {
                    attackedPlanets.add(planetName);
                } else {
                    destroyedPlanets.add(planetName);
                }
            }

        }
        if (attackedPlanets.size() > 0) {
            System.out.println(String.format("Attacked planets: %d", attackedPlanets.size()));
            for (String planet : attackedPlanets) {
                System.out.println(String.format("-> %s", planet));
            }
        } else {
            System.out.println("Attacked planets: 0");
        }
        if (destroyedPlanets.size() > 0) {
            System.out.println(String.format("Destroyed planets: %d",destroyedPlanets.size()));
            for (String planet : destroyedPlanets) {
                System.out.println(String.format("-> %s", planet));
            }
        } else {
            System.out.println("Destroyed planets: 0");
        }
    }
}