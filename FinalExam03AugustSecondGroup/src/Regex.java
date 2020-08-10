import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        Pattern pattern = Pattern.compile("^([$%])([A-Z][a-z][a-z]+)\\1: " +
                "\\[(\\d+)\\]\\|{1}" +
                "\\[(\\d+)\\]\\|{1}" +
                "\\[(\\d+)\\]\\|{1}$");

        for (int i = 0; i < n; i++) {
            String input = scan.nextLine();
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                String name = matcher.group(2);
                int first = Integer.parseInt(matcher.group(3));
                int second = Integer.parseInt(matcher.group(4));
                int third = Integer.parseInt(matcher.group(5));

                char one = (char) first;
                char two = (char) second;
                char three = (char) third;
                System.out.println(String.format("%s: %c%c%c", name, one, two, three));

            } else {
                System.out.println("Valid message not found!");
            }
        }
    }
}
