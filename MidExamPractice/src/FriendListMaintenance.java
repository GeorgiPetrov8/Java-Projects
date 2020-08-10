import java.util.Scanner;

public class FriendListMaintenance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] names = scan.nextLine().split(", ");


        int blackListCount = 0;
        int lostNamesCount = 0;
        String[] tokens = scan.nextLine().split(" ");
        while (!"Report".equals(tokens[0])); {
            tokens[0]=scan.nextLine();
            switch (tokens[0]) {
                case "Blacklist":
                    String nameForBan = tokens[1];
                    for (int i = 0; i < names.length; i++) {
                        String currentName = names[i];
                        if (nameForBan.equals(currentName)) {
                            System.out.printf("%s was blacklisted.\n", currentName);
                            names[i] = "Blacklisted";
                            blackListCount++;
                            break;
                        }else if (i==names.length - 1) {
                            System.out.printf("%s was not found.\n", nameForBan);
                        }
                    }
                    break;
                case "Error":
                    int index = Integer.parseInt(tokens[1]);
                    if (!names[index].equals("Blacklisted")) {
                        System.out.printf("%s was lost due to an error.\n", names[index]);
                        names[index] = "Lost";
                        lostNamesCount++;
                    }
                    break;
                case "Change":
                    int index1 = Integer.parseInt(tokens[1]);
                    String newName = tokens[2];
                    if (index1 <= names.length - 1) {
                        System.out.printf("%s changed his username to %s.\n", names[index1], newName);
                        names[index1] = newName;
                    }
                    break;
            }


        }
        System.out.printf("Blacklisted names: %d\n",blackListCount);
        System.out.printf("Lost names: %d\n",lostNamesCount);
        System.out.println(String.join(" ",names));
    }
}
