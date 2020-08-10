import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String[] pizzaInput = bf.readLine().split("\\s+");
        Pizza pizza = new Pizza(pizzaInput[1], Integer.parseInt(pizzaInput[2]));
        String[] doughInput = bf.readLine().split("\\s+");
        Dough dough = new Dough(doughInput[1], doughInput[2], Double.parseDouble(doughInput[3]));
        pizza.setDough(dough);

        String input;
        while (!(input = bf.readLine()).equals("END")) {
            String[] tokens = input.split("\\s+");
            String toppingType = tokens[1];
            double toppingWeight = Double.parseDouble(tokens[2]);
            Topping topping = new Topping(toppingType, toppingWeight);
            pizza.addTopping(topping);
        }

        System.out.printf("%s - %.2f", pizza.getName(), pizza.getOverallCalories());

    }
}
