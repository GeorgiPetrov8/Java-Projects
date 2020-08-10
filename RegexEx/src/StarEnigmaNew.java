import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigmaNew {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String reg = "[STARstar]"; // по условие се изисква case insensitive, затива са написани веднъж с главни и веднъж с малки букви
        Pattern pat = Pattern.compile(reg);

        int n = Integer.parseInt(scan.nextLine()); // брой редове

        List<String> attack = new ArrayList<>(); // атакувани планети
        List<String> destroyed = new ArrayList<>(); // унищожени планети

        for (int i = 0; i < n; i++) {
            String input = scan.nextLine();
            Matcher match = pat.matcher(input);

            int count = 0;

            while (match.find()) {
                count++; // броим колко букви имаме от STAR/star
            }

            String decrypted = "";
            for (int j = 0; j < input.length(); j++) {
                char symbol = (char) (input.charAt(j) - count); // от всеки символ изваждаме броя на буквите от от STAR
                decrypted += symbol; // новополученият символ го добавяме към новият String
            }

            String regex = "@(?<name>[A-Za-z]+)(?:[^@:!>\\-]*):" +
                    "(?<population>[\\d]+)(?:[^@:!>\\-]*)!" +
                    "(?<type>[AD])!(?:[^@:\\-!>]*)->" +
                    "(?<soldiers>\\d+)";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(decrypted);

            while (matcher.find()) { // докато има съвпадени по декрептираното съобщение
                String type = matcher.group("type"); // взимаме типа от съобщението
                if (type.equals("A")) { // при атака
                    attack.add(matcher.group("name")); // добавяме името към атакуваните
                } else { // при унищожаване
                    destroyed.add(matcher.group("name")); // добавяме името към унищожените
                }
            }
        }

        System.out.println(String.format("Attacked planets: %d", attack.size())); // принтираме атакуваните подредени по азбучен ре
        attack.stream().sorted().forEach(e -> {
            System.out.println(String.format("-> %s", e));
        });

        System.out.println(String.format("Destroyed planets: %d", destroyed.size())); // принтираме унищожените по азбучен ред
        destroyed.stream().sorted().forEach(e -> {
            System.out.println(String.format("-> %s", e));
        });
    }
}
