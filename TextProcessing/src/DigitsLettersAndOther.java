import java.util.Scanner;

public class DigitsLettersAndOther {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        for (int i = 0; i < input.length() ; i++) {
            if (Character.isDigit(input.charAt(i))) {
                System.out.print(input.charAt(i));

            }
        }
        System.out.println();
        for (int i = 0; i < input.length() ; i++) {
            if (Character.isLetter(input.charAt(i))) {
                System.out.print(input.charAt(i));

            }
        }
        System.out.println();
        for (int i = 0; i < input.length() ; i++) {
            if (!Character.isDigit(input.charAt(i)) && !Character.isLetter(input.charAt(i))) {
                System.out.print(input.charAt(i));
            }
        }


    }
}
