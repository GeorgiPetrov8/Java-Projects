import java.util.LinkedHashMap;
import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int capacity = Integer.parseInt(scan.nextLine());

        LinkedHashMap<String, Integer> sentMessages = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> receivedMessages = new LinkedHashMap<>();

        String input = scan.nextLine();
        while (!input.equals("Statistics")) {
            String[] tokens = input.split("=");
            switch (tokens[0]) {
                case "Add":
                    String userName = tokens[1];
                    int sent = Integer.parseInt(tokens[2]);
                    int received = Integer.parseInt(tokens[3]);
                    if (!receivedMessages.containsKey(userName) && !sentMessages.containsKey(userName)) {
                        receivedMessages.put(userName, received);
                        sentMessages.put(userName, sent);
                    }
                    break;
                case "Message":
                    String sender = tokens[1];
                    String receiver = tokens[2];
                    if (sentMessages.containsKey(sender) && receivedMessages.containsKey(receiver)) {
                        int lastCountOfSend = sentMessages.get(sender);
                        int lastCountOfReceived = receivedMessages.get(receiver);
                        receivedMessages.put(receiver, lastCountOfReceived + 1);
                        sentMessages.put(sender, lastCountOfSend + 1);
                    }
                    if (sentMessages.get(sender) >= capacity) {
                        sentMessages.remove(sender);
                        System.out.println(String.format("%s reached the capacity!", sender));
                    } else if (receivedMessages.get(receiver) >= capacity) {
                        receivedMessages.remove(receiver);
                        System.out.println(String.format("%s reached the capacity!", receiver));
                    }
                    break;
                case "Empty":
                    String username = tokens[1];
                    if (username.equals("All")) {
                        sentMessages.clear();
                        receivedMessages.clear();
                    } else if (receivedMessages.containsKey(username) && sentMessages.containsKey(username)) {
                        receivedMessages.remove(username);
                        sentMessages.remove(username);
                    }
                    break;
            }
            input = scan.nextLine();
        }
    }
}
