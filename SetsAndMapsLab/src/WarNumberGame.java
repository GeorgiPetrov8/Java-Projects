import java.util.*;
import java.util.stream.Collectors;

public class WarNumberGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        LinkedHashSet<Integer> firstPlayer = Arrays
                .stream(scan.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .boxed()
                .collect(Collectors.toCollection(LinkedHashSet::new));

        LinkedHashSet<Integer> secondPlayer = Arrays
                .stream(scan.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .boxed()
                .collect(Collectors.toCollection(LinkedHashSet::new));

        int rounds = 50;
        while (rounds > 0) {
            int firstPlayerCard = firstPlayer.iterator().next();
            firstPlayer.remove(firstPlayerCard);
            int secondPlayerCard = secondPlayer.iterator().next();
            secondPlayer.remove(secondPlayerCard);

            if (firstPlayerCard > secondPlayerCard) {
                firstPlayer.add(secondPlayerCard);
                firstPlayer.add(firstPlayerCard);
            } else if (secondPlayerCard > firstPlayerCard) {
                secondPlayer.add(firstPlayerCard);
                secondPlayer.add(secondPlayerCard);
            }

            if (firstPlayer.isEmpty() && secondPlayer.isEmpty()) {
                System.out.println("Draw!");
                return;
            } else if (firstPlayer.isEmpty()) {
                System.out.println("Second player win!");
                return;
            } else if (secondPlayer.isEmpty()) {
                System.out.println("First player win!");
                return;
            }
            rounds--;
        }

        if (firstPlayer.size() > secondPlayer.size()) {
            System.out.println("First player win!");
        } else if (secondPlayer.size() > firstPlayer.size()) {
            System.out.println("Second player win!");
        } else {
            System.out.println("Draw!");
        }

    }
}
