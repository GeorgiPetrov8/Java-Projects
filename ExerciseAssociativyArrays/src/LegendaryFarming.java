import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        TreeMap<String, Integer> map = new TreeMap<>();

        TreeMap<String, Integer> junk = new TreeMap<>();

        boolean isObtained = false;
        while (!isObtained) {
            String[] input = scan.nextLine().toLowerCase().split("\\s+");
            for (int i = 0; i < input.length; i += 2) {
                int value = Integer.parseInt(input[i]);
                String key = input[i + 1];

                if (key.equals("shards") || key.equals("fragments") || key.equals("motes")) {
                    map.put(key, value);
                    if (value >= 250) {
                        switch (key) {
                            case "shards":
                                System.out.println("Shadowmourne obtained!");
                                int result = map.get(key) - 250;
                                map.put(key, result);
                                break;
                            case "fragments":
                                System.out.println("Valanyr obtained!");
                                int result1 = map.get(key) - 250;
                                map.put(key, result1);
                                break;
                            case "motes":
                                System.out.println("Dragonwrath obtained!");
                                int result2 = map.get(key) - 250;
                                map.put(key, result2);
                                break;
                        }
                        isObtained = true;
                        break;

                    }

                }
                else {
                    junk.put(key,value);
                }

            }
            map
                    .entrySet()
                    .stream()
                    .sorted((i1, i2) -> Integer.compare(i2.getValue(), i1.getValue()))
                    .forEach(i -> System.out.println(String.format("%s: %d", i.getKey(), i.getValue())));

            junk
                    .entrySet()
                    .forEach(j -> System.out.println(String.format("%s: %d", j.getKey(), j.getValue())));
        }
    }
}
