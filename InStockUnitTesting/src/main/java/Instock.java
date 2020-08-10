import jdk.jshell.spi.ExecutionControl;

import java.util.*;
import java.util.stream.Collectors;

public class Instock implements ProductStock {
    private List<Product> stock;

    public Instock() {
        this.stock = new ArrayList<>();
    }

    @Override
    public int getCount() {
        return this.stock.size();
    }

    @Override
    public boolean contains(Product product) {
        return this.stock.contains(product);
    }

    @Override
    public void add(Product product) {
        this.stock.add(product);
    }

    @Override
    public void changeQuantity(String product, int quantity) {
        for (Product current : stock) {
            if (current.getLabel().equals(product)) {
                current.setQuantity(quantity);
                return;
            }
        }
        throw new IllegalArgumentException("Label not found");
    }

    @Override
    public Product find(int index) {
        return this.stock.get(index);
    }

    @Override
    public Product findByLabel(String label) {
        return this.stock.stream()
                .filter(p -> p.getLabel().equals(label))
                .findFirst().orElseThrow(IllegalArgumentException::new);
    }

    @Override
    public Iterable<Product> findFirstByAlphabeticalOrder(int count) {
        if (count < this.stock.size()) {
            return this.stock.stream()
                    .sorted(Comparator.comparing(Product::getLabel))
                    .limit(count)
                    .collect(Collectors.toList());
        }
        return Collections.emptyList();
    }

    @Override
    public Iterable<Product> findAllInRange(double lo, double hi) {
        return stock.stream()
                 .filter(p -> p.getPrice() > lo && p.getPrice() <= hi)
                 .sorted(Comparator.comparing(Product::getPrice))
                 .collect(Collectors.toList());
    }

    @Override
    public Iterable<Product> findAllByPrice(double price) {
       return this.stock.stream().filter(p -> p.getPrice() == price)
                .collect(Collectors.toList());
    }

    @Override
    public Iterable<Product> findFirstMostExpensiveProducts(int count) {
        if (count < this.stock.size()) {
            return this.stock.stream().sorted(Comparator.comparing(Product::getPrice))
                    .limit(count).collect(Collectors.toList());
        }
        throw new IllegalArgumentException("Products are less than counts");
    }

    @Override
    public Iterable<Product> findAllByQuantity(int quantity) {
       return this.stock.stream().filter(p -> p.getQuantity() == quantity)
                .collect(Collectors.toList());
    }

    @Override
    public Iterator<Product> iterator() {
       return this.stock.iterator();
    }
}
