import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        List<String> peoples = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] tokens = scan.nextLine().split(" ");
            if (tokens[2].equals("going!")) {
                if (peoples.contains(tokens[0])) {
                    System.out.printf("%s is already in the list!\n", tokens[0]);
                } else {
                    peoples.add(tokens[0]);
                }
            }
            else if (tokens[2].equals("not")) {
                if (peoples.contains(tokens[0])) {
                    peoples.remove(tokens[0]);
                }
                else
                    System.out.printf("%s is not in the list!\n", tokens[0]);
            }

        }
        for (String people : peoples) {
            System.out.println(people);

        }
    }
}
