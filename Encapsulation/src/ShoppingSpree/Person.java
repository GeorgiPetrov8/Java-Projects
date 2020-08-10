package ShoppingSpree;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private  double money;
    private  List<Product> bagOfProducts;

    public Person(String name, double money) {
        setName(name);
        setMoney(money);
        this.bagOfProducts = new ArrayList<>();
    }

    private void setName(String name) {
        if (name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name.trim();
    }

    private void setMoney(double money) {
        if (money < 0) {
            throw new IllegalArgumentException("Money cannot be negative");
        }
        this.money = money;
    }

    public List<Product> getBagOfProducts() {
        return bagOfProducts;
    }

    public void buyProduct(Product product) {
        if (this.getMoney() < product.getCost()) {
            throw new IllegalArgumentException(String.format("%s can't afford %s",
                    this.getName(),product.getName()));
        }
        this.setMoney(this.getMoney() - product.getCost());
        this.getBagOfProducts().add(product);
    }

    public String getName() {
        return name;
    }

    public double getMoney() {
        return money;
    }
}
