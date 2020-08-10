import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> itemsList = Arrays.stream(scan.nextLine().split("\\!")).collect(Collectors.toList());

        String command = scan.nextLine();
        while (!"Go Shopping!".equals(command)) {
            String[] tokens = command.split("\\s+");
            switch (tokens[0]) {
                case "Urgent":
                    String item = tokens[1];
                    if (!itemsList.contains(item))
                        itemsList.add(0,item);
                    break;
                case "Unnecessary":
                    String item1 = tokens[1];
                    if (itemsList.contains(item1)) {
                        itemsList.remove(item1);
                    }
                    break;
                case "Correct":
                    String oldName = tokens[1];
                    String newName = tokens[2];
                    if (itemsList.contains(oldName)) {
                        int index = itemsList.indexOf(oldName);
                        itemsList.set(index,newName);
                    }
                    break;
                case "Rearrange":
                    String item2 = tokens[1];
                    if (itemsList.contains(item2)) {
                        itemsList.remove(item2);
                        itemsList.add(item2);
                    }
                    break;
            }


            command = scan.nextLine();


        }
        System.out.println(String.join(", ",itemsList));
    }
}
