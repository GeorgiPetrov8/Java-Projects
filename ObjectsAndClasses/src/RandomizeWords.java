import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RandomizeWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] words = scan.nextLine().split("\\s+");
        Random rnd = new Random();
        for (int i = 0; i < words.length ; i++) {
          int swapIndex = rnd.nextInt(words.length);

          String tmp = words[i];
          words[i] = words[swapIndex];
          words[swapIndex] = tmp;

        }
        for (int i = 0; i < words.length ; i++) {
            System.out.println(words[i]);

        }

    }
}
