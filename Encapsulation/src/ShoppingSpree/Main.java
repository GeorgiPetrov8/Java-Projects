package ShoppingSpree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Person> people = new HashMap<>();
        Map<String, Product> products = new HashMap<>();

        String[] firstLine = bf.readLine().split(";");
        for (String personWithMoney : firstLine) {
            String[] tokens = personWithMoney.split("=");
            try {
                Person person = new Person(tokens[0], Integer.parseInt(tokens[1]));
                people.put(person.getName(), person);
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
                return;
            }
        }
        String[] secondLine = bf.readLine().split(";");
        for (String productWithCost : secondLine) {
            String[] tokens = productWithCost.split("=");
            try {
                Product product = new Product(tokens[0], Integer.parseInt(tokens[1]));
                products.put(product.getName(), product);
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
                return;
            }
        }

        String shopping = bf.readLine();
        while (!shopping.equals("END")) {
            String[] tokens = shopping.split("\\s+");
            String personName = tokens[0];
            String productName = tokens[1];

            try {
                people.get(personName).buyProduct(products.get(productName));
                System.out.println(personName + " bought " + productName);
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }

            shopping = bf.readLine();
        }

       people.forEach((key, value) -> {
            if (value.getBagOfProducts().isEmpty()) {
                System.out.println(key + " - Nothing bought");

            } else {
                StringBuilder builder = new StringBuilder();
                for (Product product : value.getBagOfProducts()) {
                    builder.append(product.getName()).append(", ");
                }
                builder.delete(builder.length() - 2, builder.length());
                System.out.printf("%s - %s%n", key, builder.toString());
            }
        });

    }
}
