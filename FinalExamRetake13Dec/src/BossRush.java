import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BossRush {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        String regex = "\\|" +
                "([A-Z]{4,})\\|:\\#" +
                "([A-Za-z]+ [A-Za-z]+)\\#";

        for (int i = 0; i < n ; i++) {
            String input = scan.nextLine();
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                String bossName = matcher.group(1);
                String title = matcher.group(2);
                System.out.println(String.format("%s, The %s",bossName, title));
                System.out.println(String.format(">> Strength: %d",bossName.length()));
                System.out.println(String.format(">> Armour: %d",title.length()));
            } else {
                System.out.println("Access denied!");
            }
        }

    }
}
