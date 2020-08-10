import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[] input = scan.nextLine().toCharArray();
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < input.length ; i++) {
            if (input[i] == ' ') {
                continue;
            }
            map.putIfAbsent(input[i],0);
            int lastValue = map.get(input[i]);
            map.put(input[i],lastValue + 1);

        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(String.format("%c -> %d",entry.getKey(),entry.getValue()));
        }
    }
}
