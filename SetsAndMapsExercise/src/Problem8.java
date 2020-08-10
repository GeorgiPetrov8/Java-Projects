import java.util.*;

public class Problem8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, Map<String, List<String>>> ipMap = new TreeMap<>();

        String input = "";
        while (!(input = scan.nextLine()).equals("end")) {
            String[] tokens = input.split("\\s+");

            String ip = tokens[0].replace("IP=", "");
            String ms = tokens[1];
            String user = tokens[2].replace("user=", "");

            ipMap.putIfAbsent(user, new LinkedHashMap<>());
            ipMap.get(user).putIfAbsent(ip, new ArrayList<>());
            ipMap.get(user).get(ip).add(ms);
        }

        ipMap.forEach((k, v) -> {
            System.out.println(k + ":");
            StringBuilder output = new StringBuilder();
            v.forEach((ip, mss) -> {
                output.append(String.format("%s => %d, ", ip, mss.size()));

            });
            System.out.println(output.substring(0, output.length() - 2) + ".");
        });
    }
}
