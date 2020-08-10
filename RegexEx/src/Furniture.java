import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> items = new ArrayList<>();
        double totalPrice = 0.0;

        String input = scan.nextLine();
        Pattern pattern = Pattern.compile(">>(?<name>[A-z]+)<<(?<price>[0-9]+\\.?[0-9]*)!(?<quantity>[0-9]+)");

        while (!input.equals("Purchase")) {
           Matcher matcher = pattern.matcher(input);
           if (matcher.find()) {
               String name = matcher.group("name");
               double price =Double.parseDouble(matcher.group("price"));
               int quantity = Integer.parseInt(matcher.group("quantity"));

               items.add(name);
               totalPrice += price * quantity;
           }

            input = scan.nextLine();
        }
        System.out.println("Bought furniture:");
        for (String item : items) {
            System.out.println(item);
        }
        System.out.printf("Total money spend: %.2f", totalPrice);

    }
}
