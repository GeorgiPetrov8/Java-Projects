package greedyTimes;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bagCapacity = Integer.parseInt(scanner.nextLine());
        Bag bag = new Bag(bagCapacity);

        String[] tokens = scanner.nextLine().split("\\s+");

        for (int i = 0; i < tokens.length; i += 2) {
            String itemType = tokens[i];
            int amount = Integer.parseInt(tokens[i + 1]);
            String itemName = "";

            if (itemType.length() == 3) {
                itemName = "Cash";
            } else if (itemType.toLowerCase().endsWith("gem")) {
                itemName = "Gem";
            } else if (itemType.toLowerCase().equals("gold")) {
                itemName = "Gold";
            } else {
                continue;
            }

            switch (itemName) {
                case "Cash":
                    Cash cash = new Cash(amount, itemType);
                    bag.addCash(cash);
                    break;
                case "Gem":
                    Gem gem = new Gem(amount, itemType);
                    bag.addGem(gem);
                    break;
                case "Gold":
                    Gold gold = new Gold(amount);
                    bag.addGold(gold);
                    break;
            }

            bag.printBag();

        }
    }
}


//            if (!torba.containsKey(kvoE)) {
//                torba.put((kvoE), new LinkedHashMap<String, Long>());
//            }
//
//            if (!torba.get(kvoE).containsKey(name)) {
//                torba.get(kvoE).put(name, 0L);
//            }
//
//
//            torba.get(kvoE).put(name, torba.get(kvoE).get(name) + broika);
//            if (kvoE.equals("Gold")) {
//                zlato += broika;
//            } else if (kvoE.equals("Gem")) {
//                kamuni += broika;
//            } else if (kvoE.equals("Cash")) {
//                mangizi += broika;
//            }
//        }
//
//        for (var x : torba.entrySet()) {
//            Long sumValues = x.getValue().values().stream().mapToLong(l -> l).sum();
//
//            System.out.println(String.format("<%s> $%s", x.getKey(), sumValues));
//
//            x.getValue().entrySet().stream().sorted((e1, e2) -> e2.getKey().compareTo(e1.getKey())).forEach(i -> System.out.println("##" + i.getKey() + " - " + i.getValue()));
//
//        }
