import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        Set<String> periodicTable = new TreeSet<>();

        while (n-- > 0) {

            String[] input = scan.nextLine().split("\\s+");

            for (int i = 0; i < input.length ; i++) {
                String chemical = input[i];
                periodicTable.add(chemical);
            }
        }

        for (String s : periodicTable) {
            System.out.print(s + " ");
        }
    }
}
