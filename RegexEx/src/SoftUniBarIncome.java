import java.sql.SQLOutput;
        import java.util.Scanner;
        import java.util.regex.Matcher;
        import java.util.regex.Pattern;

public class SoftUniBarIncome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        Pattern pattern = Pattern.compile("%(?<name>[A-Z][a-z]+)%(?:[^|$%.]*)<" +
                "(?<product>[^<>]+)>(?:[^|$%.]*)\\|" +
                "(?<count>\\d+)\\|(?:[^|$%.]*?)" +
                "(?<price>[-+]?\\d+\\.?\\d+)\\$");


        double totalIncome = 0.0;
        while (!input.equals("end of shift")) {
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                String name = matcher.group("name");
                String product = matcher.group("product");
                int count = Integer.parseInt(matcher.group("count"));
                double price = Double.parseDouble(matcher.group("price"));
                double payed = count * price;

                System.out.println(String.format("%s: %s - %.2f",name,product,payed));
                totalIncome += payed;
            }

            input = scan.nextLine();
        }
        System.out.println(String.format("Total income: %.2f", totalIncome));

    }
}
