import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        LinkedHashMap<String, Double> orders = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> rememberProducts = new LinkedHashMap<>();


        String productName = scan.nextLine();

        while (!productName.equals("buy")) {
            String[] tokens = productName.split("\\s+");
            String product = tokens[0];
            double price = Double.parseDouble(tokens[1]);
            int quantity = Integer.parseInt(tokens[2]);

            if (!orders.containsKey(product)) {
                orders.put(product, price * quantity);
                rememberProducts.put(product,quantity);


            }else {
                rememberProducts.put(product,rememberProducts.get(product) + quantity);
                orders.put(product,rememberProducts.get(product) * price);
            }
            productName = scan.nextLine();
        }
        for (Map.Entry<String, Double> entry : orders.entrySet()) {
            System.out.println(String.format("%s -> %.2f", entry.getKey(), entry.getValue()));
        }
    }
}
