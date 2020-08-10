import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Bombs {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));


        Map<String, Integer> createdBombs = new TreeMap<>();
        createdBombs.put("Datura Bombs", 0);
        createdBombs.put("Cherry Bombs", 0);
        createdBombs.put("Smoke Decoy Bombs", 0);


        List<Integer> bombEffect = Arrays.stream(bf.readLine().split(", "))
                .mapToInt(Integer::parseInt).boxed().collect(Collectors.toList());

        List<Integer> bombCasing = Arrays.stream(bf.readLine().split(", "))
                .mapToInt(Integer::parseInt).boxed().collect(Collectors.toList());

        boolean bombPouch = false;

        while (!bombEffect.isEmpty() && !bombCasing.isEmpty() && !bombPouch) {
            int effect = bombEffect.get(0);
            int casing = bombCasing.get(bombCasing.size() - 1);
            int sum = effect + casing;

            switch (sum) {
                case 40:
                    bombEffect.remove(0);
                    bombCasing.remove(bombCasing.size() - 1);
                    createdBombs.put("Datura Bombs", createdBombs.get("Datura Bombs") + 1);
                    break;
                case 60:
                    bombEffect.remove(0);
                    bombCasing.remove(bombCasing.size() - 1);
                    createdBombs.put("Cherry Bombs", createdBombs.get("Cherry Bombs") + 1);
                    break;
                case 120:
                    bombEffect.remove(0);
                    bombCasing.remove(bombCasing.size() - 1);
                    createdBombs.put("Smoke Decoy Bombs", createdBombs.get("Smoke Decoy Bombs") + 1);
                    break;
                default:
                    bombCasing.remove(bombCasing.size() - 1);
                    bombCasing.add(casing - 5);
                    break;
            }
            if (createdBombs.size() == 3) {
                if (createdBombs.get("Datura Bombs") >= 3 && createdBombs.get("Cherry Bombs") >= 3
                        && createdBombs.get("Smoke Decoy Bombs") >= 3) {
                    bombPouch = true;
                }
            }
        }

        if (bombPouch) {
            System.out.println("Bene! You have successfully filled the bomb pouch!");
        } else {
            System.out.println("You don't have enough materials to fill the bomb pouch.");
        }

        StringBuilder builder = new StringBuilder();

        if (bombEffect.isEmpty()) {
            builder.append("Bomb Effects: empty");
            System.out.println(builder);
        } else {
            builder.append("Bomb Effects: ");
            for (Integer bomb : bombEffect) {
                builder.append(bomb).append(", ");
            }
            System.out.println(builder.substring(0, builder.length() - 2));
        }


        builder.setLength(0);
        if (bombCasing.isEmpty()) {
            builder.append("Bomb Casings: empty");
            System.out.println(builder);
        } else {
            builder.append("Bomb Casings: ");
            for (Integer bomb : bombCasing) {
                builder.append(bomb).append(", ");
            }
            System.out.println(builder.substring(0, builder.length() - 2));
        }

        createdBombs.forEach((key, value) -> System.out.printf("%s: %d%n", key, value));


    }
}
