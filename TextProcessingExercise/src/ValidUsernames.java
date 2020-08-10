import java.util.Scanner;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] userNames = scan.nextLine().split(", ");
        for (String user : userNames) {
            if (isValid(user)) {
                System.out.println(user);
            }

        }
    }

    private static boolean isValid(String user) {
        if (user.length() < 3 || user.length() > 16) {
            return false;
        }
        for (int i = 0; i < user.length() ; i++) {
            char letter = user.charAt(i);
            if (letter != '_' && letter != '-' && !Character.isLetterOrDigit(letter)) {
                return false;
            }
        }
        return true;
    }
}
