import java.util.Scanner;
        import java.util.regex.Matcher;
        import java.util.regex.Pattern;

public class Password {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        String regex = "^(.*)>" +
                "(?<numbers>\\d{3})\\|" +
                "(?<lower>[a-z]{3})\\|" +
                "(?<upper>[A-Z]{3})\\|" +
                "(?<symbols>[^<>]{3})<\\1$";

        for (int i = 0; i < n ; i++) {
            String input = scan.nextLine();
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                String numbers = matcher.group("numbers");
                String lowerLetters = matcher.group("lower");
                String upperLetters = matcher.group("upper");
                String symbols = matcher.group("symbols");

                System.out.println("Password: " + numbers + lowerLetters + upperLetters + symbols);

            } else {
                System.out.println("Try another password!");
            }
        }

    }
}

