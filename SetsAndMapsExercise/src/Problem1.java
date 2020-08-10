import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Set<String> output = new LinkedHashSet<>();

        int n = Integer.parseInt(scan.nextLine());

        while (n -- > 0) {
            String input = scan.nextLine();
            output.add(input);
        }

        for (String s : output) {
            System.out.println(s);
        }
    }
}
