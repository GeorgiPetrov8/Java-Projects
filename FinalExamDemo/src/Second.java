import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Second {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        String regex = "!(?<command>[A-Z][a-z][a-z]+)!:\\[(?<text>[A-Za-z]{8,})\\]";

        for (int i = 0; i < n; i++) {
            String input = scan.nextLine();
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                String command = matcher.group("command");
                String text = matcher.group("text");
                List<Integer> encryptText = new ArrayList<>();
                for (int j = 0; j < text.length(); j++) {
                    int currentIndex = text.charAt(j);
                    encryptText.add(currentIndex);
                }
                System.out.print(String.format("%s: ",command));
                for (Integer number : encryptText) {
                    System.out.print(number + " ");
                }
                System.out.println();
            } else {
                System.out.println("The message is invalid");
            }

        }
    }
}
//Working!