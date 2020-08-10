import java.util.Arrays;
import java.util.Scanner;

public class WorldFilter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] word = Arrays.stream(scan.nextLine().split("\\s+"))
                .filter(w -> w.length() % 2 ==0)
                .toArray(String[]::new);
        for (String s : word) {
            System.out.println(s);

        }
    }
}
