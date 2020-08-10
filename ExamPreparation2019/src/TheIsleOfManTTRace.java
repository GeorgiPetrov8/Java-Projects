import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TheIsleOfManTTRace {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String regex = "([\\#\\$\\%\\*\\&])" +
                "(?<name>[A-Za-z]+)\\1=" +
                "(?<length>\\d+)!!" +
                "(?<geohashCode>.+)";

        boolean found = false;
        while (!found) {
            String input = scan.nextLine();
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);

            if (matcher.find() && Integer.parseInt(matcher.group("length"))
                    == matcher.group("geohashCode").length()) {
                String name = matcher.group("name");
                String geoCode = matcher.group("geohashCode");
                int length = Integer.parseInt(matcher.group("length"));

                StringBuilder outputCode = new StringBuilder();
                for (int i = 0; i < geoCode.length(); i++) {
                    char currentChar = geoCode.charAt(i);
                    char result = (char) (currentChar + length);
                    outputCode.append(result);
                }

                System.out.println(String.format("Coordinates found! %s -> %s",
                        name, outputCode));

                found = true;

            } else {
                System.out.println("Nothing found!");
            }
        }
    }
}
//Working! 100/100!!!