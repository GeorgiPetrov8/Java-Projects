import java.util.Scanner;

public class CaeserSipher {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();

        StringBuilder newText = new StringBuilder();

        for (int i = 0; i < text.length() ; i++) {
            char currentChar =(char) (text.charAt(i) + 3);
            newText.append(currentChar);


        }
        System.out.println(newText);

    }
}
