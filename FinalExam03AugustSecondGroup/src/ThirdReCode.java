import java.util.LinkedHashMap;
        import java.util.Map;
        import java.util.Scanner;
        import java.util.TreeMap;

public class ThirdReCode {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int capacity = Integer.parseInt(scan.nextLine());

        TreeMap<String, Integer> sentMessages = new TreeMap<>();
        TreeMap<String, Integer> receivedMessages = new TreeMap<>();

        String input = scan.nextLine();
        while (!input.equals("Statistics")) {
            String[] tokens = input.split("=");
            switch (tokens[0]) {
                case "Add":
                    String userName = tokens[1];
                    int sent = Integer.parseInt(tokens[2]);
                    int received = Integer.parseInt(tokens[3]);
                    if (!sentMessages.containsKey(userName)) {
                        sentMessages.put(userName, sent);
                        receivedMessages.put(userName, received);
                    }
                    break;
                case "Message":
                    String sender = tokens[1];
                    String receiver = tokens[2];
                    if (receivedMessages.containsKey(sender) && receivedMessages.containsKey(receiver)) {
                        int lastSenderCount = sentMessages.get(sender);
                        sentMessages.put(sender, lastSenderCount + 1);
                        int lastReceivedCount = receivedMessages.get(receiver);
                        receivedMessages.put(receiver, lastReceivedCount + 1);
                        if (sentMessages.get(sender) + receivedMessages.get(sender) >= capacity) {
                            sentMessages.remove(sender);
                            receivedMessages.remove(sender);
                            System.out.println(String.format("%s reached the capacity!", sender));
                        }
                        if (receivedMessages.get(receiver) + sentMessages.get(receiver) >= capacity) {
                            receivedMessages.remove(receiver);
                            sentMessages.remove(receiver);
                            System.out.println(String.format("%s reached the capacity!", receiver));
                        }
                    }
                    break;
                case "Empty":
                    String username = tokens[1];
                    if (username.equals("All")) {
                        sentMessages.clear();
                        receivedMessages.clear();
                    } else {
                        sentMessages.remove(username);
                        receivedMessages.remove(username);
                    }
                    break;
            }
            input = scan.nextLine();
        }
        System.out.println(String.format("Users count: %d", receivedMessages.size()));
        receivedMessages.entrySet().stream()
                .sorted((v1, v2) -> Integer.compare(v2.getValue(), v1.getValue()))
                .forEach(e -> System.out.println(String.format
                        ("%s - %d", e.getKey(), e.getValue() + sentMessages.get(e.getKey()))));
    }
}
//Working 100/100!!!