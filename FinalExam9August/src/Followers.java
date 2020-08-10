import java.util.*;

public class Followers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        TreeMap<String, Integer> followers = new TreeMap<>();

        String input = scan.nextLine();
        while (!"Log out".equals(input)) {
            String[] tokens = input.split(": ");
            switch (tokens[0]) {
                case "New follower":
                    String username = tokens[1];
                    followers.putIfAbsent(username, 0);
                    break;
                case "Like":
                    String userName = tokens[1];
                    int count = Integer.parseInt(tokens[2]);
                    if (!followers.containsKey(userName)) {
                        followers.put(userName, 0);
                    }
                    int result = followers.get(userName) + count;
                    followers.put(userName, result);
                    break;
                case "Comment":
                    String username1 = tokens[1];
                    if (!followers.containsKey(username1)) {
                        followers.put(username1, 0);
                    }
                    int result1 = followers.get(username1) + 1;
                    followers.put(username1, result1);
                    break;
                case "Blocked":
                    String userName1 = tokens[1];
                    if (followers.containsKey(userName1)) {
                        followers.remove(userName1);
                    } else {
                        System.out.println(String.format("%s doesn't exist.", userName1));
                    }
                    break;
            }
            input = scan.nextLine();
        }
        System.out.println(String.format("%d followers", followers.size()));
        followers.entrySet().stream()
                .sorted((v1, v2) -> Integer.compare(v2.getValue(), v1.getValue()))
                .forEach(v -> {
                    System.out.printf("%s: %d%n", v.getKey(), v.getValue());
                });

    }
}
