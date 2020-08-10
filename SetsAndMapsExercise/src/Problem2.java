import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] setsLength = Arrays.stream(scan.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        int firstLength = setsLength[0];
        int secondLength = setsLength[1];

        Set<Integer> firstSet = new LinkedHashSet<>();
        Set<Integer> secondSet = new LinkedHashSet<>();

        for (int i = 0; i < firstLength ; i++) {
            int number = Integer.parseInt(scan.nextLine());
            firstSet.add(number);
        }

        for (int i = 0; i < secondLength ; i++) {
            int number = Integer.parseInt(scan.nextLine());
            secondSet.add(number);
        }

        firstSet.retainAll(secondSet);
        firstSet.forEach(s -> {
            System.out.print(String.format("%s ",s));
        });


    }
}
