import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ProductShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, Map<String, Double>> mapShops = new TreeMap<>();

        String input = "";
        while (!(input = scan.nextLine()).equals("Revision")) {
            String[] tokens = input.split(", ");

            String shop = tokens[0];
            String product = tokens[1];
            double price = Double.parseDouble(tokens[2]);

            mapShops.putIfAbsent(shop, new LinkedHashMap<>());
            mapShops.get(shop).put(product,price);
        }

        for (Map.Entry<String, Map<String, Double>> entry : mapShops.entrySet()) {
            System.out.println(String.format("%s->", entry.getKey()));
            entry.getValue().entrySet().forEach(v -> {
                System.out.println(String.format("Product: %s, Price: %.1f", v.getKey(), v.getValue()));

            });
        }

    }
}

