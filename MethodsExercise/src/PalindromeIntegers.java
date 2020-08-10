import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String numbers = scan.nextLine();

        while (!numbers.equals("END")) {
            reversed(numbers);
            System.out.println(reversed(numbers));

            numbers = scan.nextLine();
        }

    }

    private static String reversed (String numbers) {
        String output = "";
        StringBuilder reversed = new StringBuilder();
        for (int i = numbers.length() - 1; i >= 0; i--) {
            reversed.append(numbers.charAt(i));

        }
        if (reversed.toString().equals(numbers)) {
            output = "true" ;
        }
        else {
            output = "false" ;
        }
        return output;
    }
}
