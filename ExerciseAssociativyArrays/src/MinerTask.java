import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MinerTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        String resource = scan.nextLine();
        while (!"stop".equals(resource)) {
           int quantity = Integer.parseInt(scan.nextLine());

            map.putIfAbsent(resource, 0);
            int lastValue = map.get(resource);
            map.put(resource,lastValue + quantity);

            resource = scan.nextLine();
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(String.format("%s -> %d",entry.getKey(),entry.getValue()));
        }

    }
}
