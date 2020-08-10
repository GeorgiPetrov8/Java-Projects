import java.util.Scanner;

public class SmallestOfThreeNumbers{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());
        int c = Integer.parseInt(scan.nextLine());
        System.out.println(printSmallestNumber(a, b, c));
    }

    private static int printSmallestNumber (int first , int second , int third ) {
        if (first < second && first < third) {
            return first;
        } else if (second < first && second < third) {
            return second;
        } else {
            return third;
        }

    }
}
