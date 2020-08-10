import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> results = new ArrayList<>();

        int number = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < number; i++) {
            String name = scan.nextLine();

            int result = 0;
            for (int j = 0; j < name.length(); j++) {
                char currentChar = name.charAt(j);

                switch (currentChar) {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                    case 'A':
                    case 'E':
                    case 'I':
                    case 'O':
                    case 'U':
                        result += currentChar * name.length();
                        break;
                    default: result += currentChar / name.length();
                    break;
                }
            }
            results.add(result);

        }
        results.stream().sorted(Integer::compareTo)
                .forEach(System.out::println);
    }
}
