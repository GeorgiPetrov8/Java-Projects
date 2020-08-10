import java.util.Scanner;

public class PasswordReset {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        String command = scan.nextLine();
        while (!command.equals("Done")) {
            String[] tokens = command.split("\\s+");
            switch (tokens[0]) {
                case "TakeOdd":
                    StringBuilder newPass = new StringBuilder();
                    for (int i = 1; i < input.length(); i++) {
                        if (i % 2 != 0) {
                            char currentChar = input.charAt(i);
                            newPass.append(currentChar);
                        }
                    }
                    input = newPass.toString();
                    System.out.println(input);
                    break;
                case "Cut":
                    int index = Integer.parseInt(tokens[1]);
                    int length = Integer.parseInt(tokens[2]);
                    StringBuilder result = new StringBuilder(input);
                    result.replace(index, index+ length, "");
                    input = result.toString();
                    System.out.println(input);
                    break;
                case "Substitute":
                    String substring = tokens[1];
                    String substitute = tokens[2];
                    if (input.contains(substring)) {
                       input = input.replaceAll(substring, substitute);
                        System.out.println(input);
                    } else {
                        System.out.println("Nothing to replace!");
                    }
                    break;
            }
            command = scan.nextLine();
        }
        System.out.printf("Your password is: %s%n", input);
    }
}
