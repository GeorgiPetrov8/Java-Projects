import java.util.Scanner;
        import java.util.regex.Matcher;
        import java.util.regex.Pattern;

public class SecondProblem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        String regex = "([*|@])(?<name>[A-Z][a-z][a-z]+)\\1: \\[(\\w)\\]\\|{1}\\[(\\w)\\]\\|{1}\\[(\\w)\\]\\|{1}$";

        for (int i = 0; i < n ; i++) {
            String input = scan.nextLine();
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                String name = matcher.group("name");
                String firstChar = matcher.group(3);
                String secondChar = matcher.group(4);
                String thirdChar = matcher.group(5);

                int first = firstChar.charAt(0);
                int second = secondChar.charAt(0);
                int third = thirdChar.charAt(0);

                System.out.println(String.format("%s: %d %d %d", name, first, second, third));
            } else {
                System.out.println("Valid message not found!");
            }

        }
    }
}
