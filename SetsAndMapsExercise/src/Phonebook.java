import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, String> phoneBook = new LinkedHashMap<>();

        String input = "";
        while (!(input=scan.nextLine()).equals("search")) {
            String[] tokens = input.split("\\-");

            String name = tokens[0];
            String number = tokens[1];

           phoneBook.putIfAbsent(name,number);
           phoneBook.put(name, number);
        }

        while (!(input=scan.nextLine()).equals("stop")) {
            if (phoneBook.containsKey(input)) {
                System.out.println(String.format("%s -> %s",input, phoneBook.get(input)));
            } else {
                System.out.println(String.format("Contact %s does not exist.",input));
            }

        }
    }
}
