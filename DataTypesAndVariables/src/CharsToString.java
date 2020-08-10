import java.util.Scanner;

public class CharsToString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char one = scan.nextLine().charAt(0);
        char two = scan.nextLine().charAt(0);
        char there = scan.nextLine().charAt(0);
        System.out.println(String.format("%c%c%c",one,two,there));






    }
}
