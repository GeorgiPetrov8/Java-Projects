import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Registration {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        String regex = "U\\$(?<name>[A-Z][a-z][a-z]+)U\\$P\\@\\$" +
                "(?<password>[A-Za-z]{5,}[0-9]+)P\\@\\$";

        int successfulCount = 0;

        for (int i = 0; i < n ; i++) {
            String input = scan.nextLine();
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                String name = matcher.group("name");
                String password = matcher.group("password");
                System.out.println("Registration was successful");
                System.out.println(String.format("Username: %s, Password: %s", name, password));
                successfulCount++;

            } else {
                System.out.println("Invalid username or password");
            }

        }
        System.out.println(String.format("Successful registrations: %d", successfulCount));
    }
}
//Working! 100/100!