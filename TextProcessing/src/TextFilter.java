import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] banWords = scan.nextLine().split(", ");
        String text = scan.nextLine();

        for (String word : banWords) {
            if (text.contains(word)) {
               text = text.replace(word,newWord(word.length()));
            }

        }
        System.out.println(text);
    }

    private static String newWord(int wordLength) {
        String replace = "";
        for (int i = 0; i < wordLength; i++) {
            replace += "*";
        }
        return replace;
    }
    
}