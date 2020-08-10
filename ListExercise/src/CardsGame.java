import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> firsHand = Arrays
                .stream(scan.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> secondHand = Arrays
                .stream(scan.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        while (firsHand.size() > 0 && secondHand.size() > 0) {


            int firstPlayerCard = firsHand.remove(0);
            int secondPlayerCard = secondHand.remove(0);
            if (firstPlayerCard > secondPlayerCard) {
                firsHand.add(firstPlayerCard);
                firsHand.add(secondPlayerCard);
            } else if (secondPlayerCard > firstPlayerCard) {
                secondHand.add(secondPlayerCard);
                secondHand.add(firstPlayerCard);
            }


        }
        if (firsHand.size() > 0) {
            sumAndPrint(firsHand, "First");
        } else if (secondHand.size() > 0)
            sumAndPrint(secondHand, "Second");

    }
    private static void sumAndPrint (List<Integer> playerWinner , String player) {
        int sum = 0;
        for (int card : playerWinner)
            sum+=card;
        System.out.println(player + " player wins! Sum: " + sum);
    }
}

