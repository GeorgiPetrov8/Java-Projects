import java.util.Scanner;

public class MultiplyEvenByOdds {

    private static int getMultiplyOfEvensAndOdds (int n) {
        int evens = getSumOfEvenDigits(n);
        int odds = getSumOfOddsDigits(n);

        return evens * odds ;
    }

    private static int getSumOfOddsDigits(int n) {
        int oddsSum = 0 ;

        while (n != 0) {
            int rem = n % 10;
            if (rem % 2 !=0) {
                oddsSum+= rem;
                n = n / 10;
            }else {
                n = n / 10;
            }
        }
        return  oddsSum;
    }

    private static int getSumOfEvenDigits(int n) {
        int evenSum = 0;

        while (n != 0) {
            int rem = n % 10;
            if (rem % 2==0) {
                evenSum += rem;
                n = n / 10;
            }else {
                n = n / 10;
            }
        }
        return evenSum;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = Integer.parseInt(scan.nextLine());
        System.out.println(getMultiplyOfEvensAndOdds(input));
    }
}
