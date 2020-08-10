import java.util.Scanner;

public class CharacterMultiplayer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split("\\s+");
        String first = input[0];
        String second = input[1];


        System.out.println(sum(first, second));


    }

    private static int sum(String first, String second) {
        int min = Math.min(first.length(), second.length());
        int max = Math.max(first.length(), second.length());
        int sum = 0;

        if (first.length() == max) {
            for (int i = 0; i < max; i++) {
                if (i < min) {
                    sum += first.charAt(i) * second.charAt(i);
                } else {
                    sum += first.charAt(i);
                }

            }
        } else {
            for (int i = 0; i < max; i++) {
                if (i < min) {
                    sum += second.charAt(i) * first.charAt(i);
                } else {
                    sum += second.charAt(i);
                }

            }
        }
        return sum;
    }

}
