import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FirstLab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String regex = "\\b[A-Z][a-z]+ [A-Z][a-z]+\\b";
        Pattern pattern = Pattern.compile(regex);

        String input = scan.nextLine();
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            System.out.println(matcher.group() + " ");
        }
    }
}
