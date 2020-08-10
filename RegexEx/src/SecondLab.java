import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SecondLab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String regex = "\\+359([- ])2\\1[\\d]{3}\\1[\\d]{4}\\b";
        Pattern pattern = Pattern.compile(regex);

        List<String> matchedPhones = new ArrayList<>();

        String phones = scan.nextLine();
        Matcher phoneMatcher = pattern.matcher(phones);

        while (phoneMatcher.find()) {
            matchedPhones.add(phoneMatcher.group(0));

        }
        System.out.println(String.join(", ",matchedPhones));


    }
}
