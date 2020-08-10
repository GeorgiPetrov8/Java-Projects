import java.util.*;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<Character, Integer> countSymbols = new TreeMap<>();

        char[] input = scan.nextLine().toCharArray();

        for (char currentSymbol : input) {
            countSymbols.putIfAbsent(currentSymbol, 0);
            countSymbols.put(currentSymbol, countSymbols.get(currentSymbol) + 1);
        }

        countSymbols.entrySet().forEach(e-> {
            System.out.println(String.format("%c: %d time/s",e.getKey(),e.getValue()));
        });

    }
}
