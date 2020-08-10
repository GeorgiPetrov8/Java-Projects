import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmailValidator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String email = scan.nextLine();

        String input = scan.nextLine();
        while (!input.equals("Complete")) {
            String[] tokens = input.split("\\s+");
            String command = tokens[0];
            switch (command) {
                case "Make":
                    String caseType = tokens[1];
                    if (caseType.equals("Upper")) {
                        email = email.toUpperCase();
                    } else {
                        email = email.toLowerCase();
                    }
                    System.out.println(email);
                    break;
                case "GetDomain":
                    int count = Integer.parseInt(tokens[1]);
                    StringBuilder domain = new StringBuilder();
                    for (int i = email.length() - 1; i >= email.length() - count ; i--) {
                        char currentChar = email.charAt(i);
                        domain.append(currentChar);
                    }
                    System.out.println(domain.reverse());
                    break;
                case "GetUsername":
                    if (email.contains("@")) {
                        int endIndex = email.indexOf("@");
                        String userName = email.substring(0, endIndex);
                        System.out.println(userName);
                    } else {
                        System.out.println(String.format("The email %s doesn't contain the @ symbol.",email));
                    }
                    break;
                case "Replace":
                    char charToReplace = tokens[1].charAt(0);
                     email = email.replace(charToReplace,'-');
                    System.out.println(email);
                    break;
                case "Encrypt":
                    List <Integer> encryptedNumbers = new ArrayList<>();
                    for (int i = 0; i < email.length() ; i++) {
                        int number = email.charAt(i);
                        encryptedNumbers.add(number);
                    }
                    for (Integer number : encryptedNumbers) {
                        System.out.print(number + " ");
                    }
                    break;
            }
            input = scan.nextLine();
        }

    }
}
//Working ! 100/100
