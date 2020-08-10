import java.util.Scanner;

public class Sequence2k {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine()); //100
        int number = 1;

        while (number <= n) {
            System.out.println(number);
            number = number * 2 + 1;
        }


    }
}
