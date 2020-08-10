package revolt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LootBox {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> firstBox = Arrays.stream(bf.readLine().split("\\s+"))
                .mapToInt(Integer::parseInt).boxed().collect(Collectors.toList());

        List<Integer> secondBox = Arrays.stream(bf.readLine().split("\\s+"))
                .mapToInt(Integer::parseInt).boxed().collect(Collectors.toList());

        List<Integer> claimedItems = new ArrayList<>();

        while (!firstBox.isEmpty() && !secondBox.isEmpty()) {
            int sum = firstBox.get(0) + secondBox.get(secondBox.size() - 1);
            if (sum % 2 == 0) {
                firstBox.remove(0);
                secondBox.remove(secondBox.size() - 1);
                claimedItems.add(sum);
            } else {
                firstBox.add(secondBox.remove(secondBox.size() - 1));
            }
        }

        if (firstBox.isEmpty()) {
            System.out.println("First lootbox is empty");
        } else {
            System.out.println("Second lootbox is empty");
        }

        int value = 0;
        for (Integer item : claimedItems) {
            value += item;
        }

        if (value >= 100) {
            System.out.println("Your loot was epic! Value: " + value);
        } else {
            System.out.println("Your loot was poor... Value: " + value);
        }



    }
}
