import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= n ; i++) {
            if (isTopNumber(i)) {
                System.out.println(i);
            }
            
        }

    }
    private static boolean isTopNumber(int number) {
        int sum = 0;
        boolean hasOddDigit = false;
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number = number / 10;
            if (digit % 2 != 0) {
                hasOddDigit = true;
            }

        }
        if (sum % 8 == 0 && hasOddDigit) {
            return true;
        }
        return false;
    }

 
}
