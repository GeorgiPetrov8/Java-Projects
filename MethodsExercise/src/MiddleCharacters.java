import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        printMiddleCharacters(input);

    }
    private static void printMiddleCharacters (String text) {
        if (text.length() % 2 == 0) {
            for (int i = text.length() / 2 - 1; i <= text.length() / 2 ; i++) {
                char letter = text.charAt(i);
                System.out.print(letter);
            }
        } else {
            char letter = text.charAt(text.length() / 2 );
            System.out.println(letter);
        }
    }
}
