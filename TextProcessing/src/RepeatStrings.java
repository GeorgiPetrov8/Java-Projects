import java.util.Scanner;

public class RepeatStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] text = scan.nextLine().split("\\s+");

        StringBuilder output = new StringBuilder();

        for (String element : text) {
            int count = element.length();
            for (int i = 0; i < count; i++) {
                output.append(element);

            }

        }
        System.out.println(output);
    }
}
