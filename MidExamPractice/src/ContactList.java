import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ContactList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> contactList = Arrays
                .stream(scan.nextLine().split("\\s+"))
                .collect(Collectors.toList());
        String command = scan.nextLine();
        while (!command.equals("Print Normal") && command.equals("Print Reversed")) {
            String[] tokens = command.split("\\s+");
            switch (tokens[0]) {
                case "Add":
                    String contact = tokens[1];
                    int index = Integer.parseInt(tokens[2]);
                    if (contactList.contains(contact)) {
                        if (index >= 0 && index < contactList.size()) {
                            contactList.add(index, contact);
                        }
                    } else {
                        contactList.add(contact);
                    }
                    break;
                case "Remove":
                    int index1 = Integer.parseInt(tokens[1]);
                    if (index1 >= 0 && index1 < contactList.size()) {
                        contactList.remove(index1);
                    }
                    break;
                case "Export":
                    int startIndex = Integer.parseInt(tokens[1]);
                    int count = Integer.parseInt(tokens[2]);

                    if (count < contactList.size()) {
                        for (int i = startIndex; i < count; i++) {
                            System.out.println(contactList.get(i) + " ");

                        }
                        System.out.println();
                    } else {
                        for (int i = startIndex; i < contactList.size(); i++) {
                            System.out.println(contactList.get(i) + " ");

                        }
                        System.out.println();
                    }
                    break;

            }
            command = scan.nextLine();
        }
        if (command.equals("Print Normal")) {
            System.out.print("Contacts: ");
            for (int i = 0; i < contactList.size(); i++) {
                System.out.print(contactList.get(i) + " ");

            }


        } else {
            System.out.print("Contacts: ");
            for (int i = contactList.size() - 1; i >= 0; i--) {
                System.out.print(contactList.get(i) + " ");


            }
        }
    }
}
