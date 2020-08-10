import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> people = Arrays.stream(scan.nextLine().split("\\s+"))
                .collect(Collectors.toList());


        Predicate<List<Predicate<Integer>>> predicate = list -> {

        }

        List<Predicate<Integer>> predicateList = new ArrayList<>();
        
        String input = scan.nextLine();
        while (!input.equals("Party!")) {
            String[] tokens = input.split("\\s+");
           if (tokens[0].equals("Remove")) {

           } else {

           }

            input = scan.nextLine();
        }


    }
}
