import java.util.Scanner;

public class StringExplosion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        StringBuilder output = new StringBuilder();

        int power = 0;
        for (int i = 0; i < input.length() ; i++) {
            char currentLetter = input.charAt(i);
            if (currentLetter == '>') {
                output.append('>');
                power += Integer.parseInt(String.valueOf(input.charAt(i + 1)));
            }else if (power == 0) {
                output.append(currentLetter);
            }else {
                power--;
            }

        }
        System.out.println(output);

    }
}
