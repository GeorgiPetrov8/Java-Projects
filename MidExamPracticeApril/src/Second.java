import java.util.*;
import java.util.stream.Collectors;

public class Second {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split("\\|");
        List<String> inputList = Arrays.stream(input).collect(Collectors.toList());

        String command = scan.nextLine();
        while (!command.equals("Done")) {
            String[] tokens = command.split("\\s+");
            switch (tokens[1]) {
                case "Left":
                    int index = Integer.parseInt(tokens[2]);
                    if (index >= 1 && index <= inputList.size() - 1) {
                        Collections.swap(inputList,index,index - 1);
                    }
                    break;
                case "Right":
                    int index1 = Integer.parseInt(tokens[2]);
                    if (index1 >= 0 && index1 < inputList.size() - 1) {
                        Collections.swap(inputList, index1, index1 + 1);
                    }
                    break;
                case "Even":
                    List<String> even = new ArrayList<>();
                    for (int i = 0; i < inputList.size() ; i += 2) {
                        even.add(inputList.get(i));
                    }
                    System.out.println(String.join(" ", even));
                    break;
                case "Odd":
                    List<String> odd = new ArrayList<>();
                    for (int i = 1; i < inputList.size() ; i += 2) {
                        odd.add(inputList.get(i));
                    }
                    System.out.println(String.join(" ", odd));
                    break;

            }
            command = scan.nextLine();
        }
        System.out.println("You crafted " + String.join("", inputList) + "!");

    }
}
