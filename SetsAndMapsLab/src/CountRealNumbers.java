import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double[] numbers = Arrays.stream(scan.nextLine().split("\\s+"))
                .mapToDouble(Double::parseDouble).toArray();

        Map<Double, Integer> mapOfNum = new LinkedHashMap<>();

        for (double number : numbers) {
            if (!mapOfNum.containsKey(number)) {
                mapOfNum.put(number, 1);
            } else {
                mapOfNum.put(number, mapOfNum.get(number) + 1);
            }
        }

        for (Map.Entry<Double, Integer> entry : mapOfNum.entrySet()) {
            System.out.println(String.format("%.1f -> %d",entry.getKey(), entry.getValue()));
        }
    }
}
