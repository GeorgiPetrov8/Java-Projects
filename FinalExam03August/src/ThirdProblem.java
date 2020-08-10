import java.util.*;

public class ThirdProblem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        TreeMap<String, List<Integer>> records = new TreeMap<>();

        String input = scan.nextLine();
        while (!input.equals("Results")) {
            String[] tokens = input.split(":");
            switch (tokens[0]) {
                case "Add":
                    String personName = tokens[1];
                    int health = Integer.parseInt(tokens[2]);
                    int energy = Integer.parseInt(tokens[3]);
                    if (!records.containsKey(personName)) {
                        records.put(personName, new ArrayList<>());
                        records.get(personName).add(health);
                        records.get(personName).add(energy);
                    } else {
                        int lastHealth = records.get(personName).get(0);
                        records.get(personName).set(0,lastHealth + health);
                    }
                    break;
                case "Attack":
                    String attackerName = tokens[1];
                    String defenderName = tokens[2];
                    int damage = Integer.parseInt(tokens[3]);
                    if (records.containsKey(attackerName) && records.containsKey(defenderName)) {
                       int healthLeft = records.get(defenderName).get(0) - damage;
                       if (healthLeft <= 0) {
                           records.remove(defenderName);
                           System.out.println(String.format("%s was disqualified!",defenderName));
                       }else {
                           records.get(defenderName).set(0,healthLeft);
                       }
                       int energyLeft = records.get(attackerName).get(1) - 1;
                       if (energyLeft == 0) {
                           records.remove(attackerName);
                           System.out.println(String.format("%s was disqualified!", attackerName));
                       } else {
                           records.get(attackerName).set(1,energyLeft);
                       }
                    }
                    break;
                case "Delete":
                    String userName = tokens[1];
                        if (userName.equals("All")) {
                            records.clear();

                        } else {
                            records.remove(userName);
                        }

                    break;

            }
            input = scan.nextLine();
        }
        System.out.println(String.format("People count: %d", records.size()));
        records.entrySet().stream()
                .sorted((k1, k2) -> Integer.compare(k2.getValue().get(0), k1.getValue().get(0)))
                .forEach(k -> System.out.println(String.format("%s - %d - %d", k.getKey(),
                        k.getValue().get(0),
                        k.getValue().get(1))));
    }
}