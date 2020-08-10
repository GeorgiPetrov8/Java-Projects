import java.util.Arrays;
        import java.util.List;
        import java.util.Scanner;
        import java.util.stream.Collectors;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbers = Arrays
                .stream(scan.nextLine()
                        .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String[] input = scan.nextLine().split("\\s+");
        int specialNum = Integer.parseInt(input[0]);
        int power = Integer.parseInt(input[1]);
        while (numbers.contains(specialNum)) {
            int indexBomb = numbers.indexOf(specialNum);

            int left = Math.max(0, indexBomb - power);
            int right = Math.min(numbers.size() - 1, indexBomb + power);

            for (int i = right; i >= left; i--) {
                numbers.remove(i);

            }
        }
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);

        }
        System.out.println(sum);

    }
}

