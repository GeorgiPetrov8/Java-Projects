import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = (int) scan.nextLine().charAt(0);
        int b = (int) scan.nextLine().charAt(0);
        printCharactersInRange(a, b);

    }

    private static void printCharactersInRange(int first, int last) {
        if (first < last) {
            for (int i = first + 1; i < last; i++) {
                System.out.print((char) i + " ");
            }
        } else {
            for (int i = last + 1; i < first; i++) {
                System.out.print((char) i + " ");
            }
        }
    }
}