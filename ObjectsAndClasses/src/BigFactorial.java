import java.math.BigInteger;
import java.util.Scanner;

public class BigFactorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());
        BigInteger result = new BigInteger("1");
        for (int i = 2; i <= number ; i++) {
            BigInteger multiplier = new BigInteger("" + i);
            result = result.multiply(multiplier);

        }
        System.out.println(result);

    }
}
