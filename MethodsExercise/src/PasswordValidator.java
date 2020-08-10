import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        printOutput(input);
    }

    private static void printOutput(String pass) {
        int counter = 0;
        int number = 0;

        for (int i = 0; i < pass.length(); i++) {
            char character = pass.charAt(i);
            switch (character) {
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    number++;
                    break;
            }
            counter++;
        }

        if (counter >= 6 && counter <= 10) {
            if (number >= 2) {
                System.out.println("Password is valid");
            } else {
                System.out.println("Password must consist only of letters and digits\n" +
                        "Password must have at least 2 digits");
            }

        } else {
            System.out.println("Password must be between 6 and 10 characters\n" +
                    "Password must have at least 2 digits");
        }
    }
}
