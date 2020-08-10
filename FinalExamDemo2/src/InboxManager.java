import java.util.*;

public class InboxManager {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        TreeMap<String, List<String>> usersAndEmails = new TreeMap<>();

        String input = scan.nextLine();
        while (!input.equals("Statistics")) {
            String[] tokens = input.split("->");
            switch (tokens[0]) {
                case "Add":
                    String userName = tokens[1];
                    if (usersAndEmails.containsKey(userName)) {
                        System.out.println(String.format("%s is already registered",userName));
                    } else {
                        List<String> emails = new ArrayList<>();
                        usersAndEmails.put(userName, emails);
                    }
                    break;
                case "Send":
                    String userName1 = tokens[1];
                    String email = tokens[2];
                    if (usersAndEmails.containsKey(userName1)) {
                        usersAndEmails.get(userName1).add(email);
                    }
                    break;
                case "Delete":
                    String username = tokens[1];
                   if (usersAndEmails.containsKey(username)) {
                       usersAndEmails.remove(username);
                   } else {
                       System.out.println(String.format("%s not found!",username));
                   }
                    break;
            }
            input = scan.nextLine();
        }
        System.out.println(String.format("Users count: %d",usersAndEmails.size()));
        usersAndEmails.entrySet().stream()
                .sorted((k1, k2) -> Integer.compare(k2.getValue().size(),k1.getValue().size()))
                .forEach(k -> {
                    System.out.println(k.getKey());
                    k.getValue().forEach(e -> System.out.println(String.format(" - %s", e)));
                });
    }
}
//Working! 100/100!