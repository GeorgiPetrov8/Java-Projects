import org.w3c.dom.ls.LSOutput;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class PopulationCounter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, Map<String, Integer>> pplCount = new TreeMap<>();

        String input = "";
        while (!(input = scan.nextLine()).equals("report")) {
            String[] tokens = input.split("\\|");

            String city = tokens[0];
            String country = tokens[1];
            int population = Integer.parseInt(tokens[2]);

            pplCount.putIfAbsent(country, new TreeMap<>());
            pplCount.get(country).putIfAbsent(city, population);

        }

        pplCount.entrySet().stream()
                .sorted((e1, e2) -> {
                    int totalPpl = e1.getValue().values().stream().mapToInt(Integer::intValue).sum();
                    int totalPpl1 = e2.getValue().values().stream().mapToInt(Integer::intValue).sum();
                    return Math.min(totalPpl, totalPpl1);
                }).forEach(e -> {
            int total = e.getValue().values().stream().mapToInt(Integer::intValue).sum();
            System.out.printf("%s (total population : %d)%n", e.getKey(), total);
            e.getValue().forEach((key,value)-> {
                System.out.printf("=>%s: %d%n",key,value);
            });
        });


    }
}

