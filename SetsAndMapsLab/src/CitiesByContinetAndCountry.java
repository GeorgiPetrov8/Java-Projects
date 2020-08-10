import java.util.*;

public class CitiesByContinetAndCountry {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        Map<String, Map<String, List<String>>> earth = new LinkedHashMap<>();

        while (n-- > 0) {
            String[] input = scan.nextLine().split("\\s+");

            String continent = input[0];
            String country = input[1];
            String city = input[2];

            earth.putIfAbsent(continent, new LinkedHashMap<>());
            earth.get(continent).putIfAbsent(country, new ArrayList<>());
            earth.get(continent).get(country).add(city);
        }

        earth.entrySet().forEach(e -> {
            System.out.println(String.format("%s:", e.getKey()));
            e.getValue().forEach((k, v) -> {
                System.out.print(String.format("%s -> ", k));
                System.out.println(v.toString()
                        .replaceAll("[\\[\\]]",""));
            });
        });
    }

}
