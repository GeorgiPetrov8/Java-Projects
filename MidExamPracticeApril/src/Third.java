import java.util.*;
import java.util.stream.Collectors;

public class Third {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> inputList = Arrays.stream(scan.nextLine()
                .split("\\:"))
                .collect(Collectors.toList());

        List<String> output = new ArrayList<>();

        String input = scan.nextLine();
        while (!input.equals("Ready")) {
            String[] tokens = input.split("\\s+");
            switch (tokens[0]) {
                case "Add":
                    String cardName = tokens[1];
                    if (inputList.contains(cardName)) {
                       output.add(output.size() , cardName);
                    } else {
                        System.out.println("Card not found.");
                    }
                    break;
                case "Insert":
                    String cardName1 = tokens[1];
                    int index = Integer.parseInt(tokens[2]);
                    if (index >= 0 && index <= inputList.size() - 1) {
                        if (inputList.contains(cardName1)) {
                            output.add(index, cardName1);
                        } else {
                            System.out.println("Error!");
                        }
                    } else {
                        System.out.println("Error!");
                    }
                    break;
                case "Remove":
                    String nameOfCard = tokens[1];
                    if (output.contains(nameOfCard)) {
                        output.remove(nameOfCard);
                    } else {
                        System.out.println("Card not found.");
                    }
                    break;
                case "Swap":
                    String cardOne = tokens[1];
                    String cardTwo = tokens[2];
                    int indexOne = output.indexOf(cardOne);
                    int indexTwo = output.indexOf(cardTwo);
                    Collections.swap(output, indexOne, indexTwo);
                    break;
                case "Shuffle":
                    Collections.reverse(output);
                    break;
            }
            input = scan.nextLine();
        }
        System.out.println(String.join(" ", output));
    }
}
