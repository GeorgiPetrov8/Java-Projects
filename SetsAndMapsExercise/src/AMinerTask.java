import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, Integer> items = new LinkedHashMap<>();

        String item = "";
        while (!(item=scan.nextLine()).equals("stop")) {
           int quantity = Integer.parseInt(scan.nextLine());
           items.putIfAbsent(item, 0);
           items.put(item,items.get(item) + quantity);
        }

        for (Map.Entry<String, Integer> entry : items.entrySet()) {
            System.out.println(String.format("%s -> %d", entry.getKey(), entry.getValue()));
        }
    }
}
