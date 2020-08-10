import java.util.Scanner;

public class ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        int counter = 1;
        for (int i = 0; i < input.length() - 1 ; i++) {
            char currentLetter = input.charAt(i);
            char nextLetter = input.charAt(i + 1);
            if (currentLetter == nextLetter) {
                counter++;
            }

        }
        if (counter == input.length()) {
            System.out.println(input.charAt(0));
            return;
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length() - 1; i++) {
            char currentLetter = input.charAt(i);
            char nextLetter = input.charAt(i + 1);

            if (currentLetter != nextLetter) {
                result.append(currentLetter);
            }

        }
        char lastIndex = input.charAt(input.length() - 1);
            result.append(lastIndex);


        System.out.println(result);

    }
}
