import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String strToRemove = scan.nextLine();
        String input = scan.nextLine();

        while (input.contains(strToRemove)) {
         input = input.replace(strToRemove,"");
        }
        System.out.println(input);
    }
}
