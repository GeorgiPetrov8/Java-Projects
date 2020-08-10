import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FancyBarcodes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n ; i++) {
            String input = scan.nextLine();
            String regex = "[@]{1}#+" +
                    "(?<code>[A-Z][A-Za-z0-9]{4,}[A-Z]{1})[@]{1}#+";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                String productGroup = matcher.group("code");
                StringBuilder result = new StringBuilder();
                for (int j = 0; j < productGroup.length() ; j++) {
                    char currentSymbol = productGroup.charAt(j);
                    if (Character.isDigit(currentSymbol)) {
                        result.append(currentSymbol);
                    }
                }
                if (result.toString().equals("")) {
                    System.out.println("Product group: 00");
                } else {
                    System.out.println(String.format("Product group: %s", result.toString()));
                }

            } else {
                System.out.println("Invalid barcode");
            }
        }
    }
}
