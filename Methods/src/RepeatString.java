import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        int count = Integer.parseInt(scan.nextLine());

        repeatString(input , count);
    }

    private static String repeatString(String input, int count) {
        String result = "";
        for (int i = 0; i < count ; i++) {
            System.out.print(input);
        }
        return result;
    }
}
