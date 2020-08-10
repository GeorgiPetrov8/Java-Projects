import java.util.Arrays;
import java.util.Scanner;

public class EncryptSortAndPrintArray {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int[] sumNumbers = new int[n];

        int sum = 0;
        for (int i = 0; i < n; i++) {
            char[] letter = scan.next().toCharArray();
            for (char let : letter) {
                if (let == 'a' || let == 'e' || let == 'i' || let == 'o' || let == 'u') {
                    let *= letter.length;
                    sum += let;
                } else {
                    let /= letter.length;
                    sum += let;
                }
            }
            sumNumbers[i] = sum;
            sum = 0;

        }
        Arrays.sort(sumNumbers);
        for (int element : sumNumbers) {
            System.out.println(element);

        }
    }

}






