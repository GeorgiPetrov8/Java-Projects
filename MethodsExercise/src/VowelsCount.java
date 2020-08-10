import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        System.out.println(countNumbersOfVowels(input));
    }

    private static int countNumbersOfVowels(String text) {
        int counter = 0;

        for (int i = 0; i < text.length(); i++) {
            char letter = text.toLowerCase().charAt(i);
            switch (letter) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    counter++;
                    break;
            }

        }

        return counter;
    }
}
