import java.util.*;
import java.util.stream.Collectors;

public class MovingTarget {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> targets = Arrays
                .stream(scan.nextLine()
                        .split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        String input = scan.nextLine();
        while (!input.equals("End")) {
            String[] tokens = input.split("\\s+");
            switch (tokens[0]) {
                case "Shoot":
                    int index = Integer.parseInt(tokens[1]);
                    int power = Integer.parseInt(tokens[2]);
                    if (index >= 0 && index <= targets.size() - 1) {
                        int result = targets.get(index) - power;
                        if (result <= 0) {
                            targets.remove(index);
                        } else {
                            targets.set(index, result);
                        }
                    }
                    break;
                case "Add":
                    int indexAdd = Integer.parseInt(tokens[1]);
                    int value = Integer.parseInt(tokens[2]);
                    if (indexAdd >= 0 && indexAdd <= targets.size() - 1) {
                        targets.add(indexAdd, value);
                    } else {
                        System.out.println("Invalid placement!");
                    }
                    break;
                case "Strike":
                    int indexStrike = Integer.parseInt(tokens[1]);
                    int radius = Integer.parseInt(tokens[2]);

                    if (indexStrike >= 0 && indexStrike <= targets.size() - 1) {
                        int left = indexStrike - radius;
                        int right = indexStrike + radius;

                        if (left >= 0 && right <= targets.size() - 1) {
                            for (int i = right; i >= left; i--) {
                                targets.remove(targets.get(i));
                            }

                        } else {
                            System.out.println("Strike missed!");
                        }

                    } else {
                        System.out.println("Strike missed!");
                    }
                    break;
            }

            input = scan.nextLine();
        }
        List<String> result = targets.stream().map(Objects::toString).collect(Collectors.toList());
        System.out.println(String.join("|", result));
    }
}
//Done!