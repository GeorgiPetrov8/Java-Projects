package greedyTimes;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Bag {
    private HashMap<String, TreeMap<String, Integer>> bagAmount;
    private int bagCapacity;
    private int currentQuantity;

    public Bag(int bagCapacity) {
        this.bagAmount = new HashMap<>(bagCapacity);
        this.bagCapacity = bagCapacity;
    }

    public void addGem(Gem gem) {
        if (this.currentQuantity + gem.getAmount() <= this.bagCapacity) {
            if (gem.getAmount() + this.getTotalGemAmount() <= this.getTotalGoldAmount()) {
                bagAmount.putIfAbsent("Gem", new TreeMap<>());
                bagAmount.get("Gem").putIfAbsent(gem.getGemType(), 0);
                bagAmount.get("Gem").put(gem.getGemType(), bagAmount.get("Gem").get(gem.getGemType()) + gem.getAmount());
                currentQuantity += gem.getAmount();
            }
        }

    }

    public void addGold(Gold gold) {
        if (this.currentQuantity + gold.getAmount() <= this.bagCapacity) {
            bagAmount.putIfAbsent("Gold", new TreeMap<>());
            bagAmount.get("Gold").putIfAbsent("Gold", 0);
            bagAmount.get("Gold").put("Gold", bagAmount.get("Gold").get("Gold") + gold.getAmount());
            currentQuantity += gold.getAmount();
        }
    }

    public void addCash(Cash cash) {
        if (this.currentQuantity + cash.getAmount() <= this.bagCapacity) {
            if (cash.getAmount() + this.getTotalCash() <= this.getTotalGemAmount()) {
                bagAmount.putIfAbsent("Cash", new TreeMap<>());
                bagAmount.get("Cash").putIfAbsent(cash.getCurrency(), 0);
                bagAmount.get("Cash").put(cash.getCurrency(), bagAmount.get("Cash")
                        .get(cash.getCurrency()) + cash.getAmount());
                currentQuantity += cash.getAmount();
            }
        }

    }

    private int getTotalGoldAmount() {
        return this.getTotalAmount("Gold");
    }

    private int getTotalGemAmount() {
        return this.getTotalAmount("Gem");
    }

    private int getTotalCash() {
        return this.getTotalAmount("Cash");
    }

    private int getTotalAmount(String itemName) {
        if (this.bagAmount.containsKey(itemName)) {
            return bagAmount.get(itemName).values().stream().mapToInt(v -> v).sum();
        } else {
            return 0;
        }
    }

//    public void printBag() {
//        bagAmount.entrySet().stream()
//                .sorted(Comparator.comparingInt(e -> this.getTotalAmount(e.getKey())))
//                .forEach(e -> e.getValue().entrySet().stream()
//                        .sorted(Map.Entry.comparingByKey())
//                .forEach(key -> key.)
//
//    }
}
