import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TanksCollector {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(", ");

        List<String> tanksList = new ArrayList<>(Arrays.asList(input));
        int commandsCount = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < commandsCount; i++) {
            String[] tokens = scan.nextLine().split(", ");
            String nameOfCommand = tokens[0];
            switch (nameOfCommand) {
                case "Add":
                    String currentTank = tokens[1];
                    if (tanksList.contains(currentTank)) {
                        System.out.println("Tank is already bought");
                    } else {
                        tanksList.add(currentTank);
                        System.out.println("Tank successfully bought");
                    }
                    break;
                case "Remove":
                    String currentTank1 = tokens[1];
                    if (tanksList.contains(currentTank1)) {
                        tanksList.remove(currentTank1);
                        System.out.println("Tank successfully sold");
                    } else if (!tanksList.contains(currentTank1)) {
                        System.out.println("Tank not found");
                    }
                    break;
                case "Remove At":
                    int index = Integer.parseInt(tokens[1]);
                    if (index > tanksList.size()) {
                        System.out.println("Index out of range");
                    } else if (index <= tanksList.size()) {
                        tanksList.remove(index);
                        System.out.println("Tank successfully sold");
                    }
                    break;
                case "Insert":
                    int index1 = Integer.parseInt(tokens[1]);
                    String currentTank2 = tokens[2];
                    if (index1 > tanksList.size()) {
                        System.out.println("Index out of range");
                    } else if (index1 <= tanksList.size()) {
                        if (tanksList.contains(currentTank2)) {
                            System.out.println("Tank is already bought");
                        } else if (!tanksList.contains(currentTank2)){
                            tanksList.add(index1,currentTank2);
                            System.out.println("Tank successfully bought");
                        }
                    }
                    break;
            }

        }
        System.out.println(String.join(", ", tanksList));
    }
}
