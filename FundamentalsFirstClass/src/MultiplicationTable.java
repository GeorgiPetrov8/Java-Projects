import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = Integer.parseInt(scan.nextLine());
        int product=0;
        for (int i = 1; i <= 10; i++) {
           product=i*input;
            System.out.println(input + " " + "X" + " " + i + " " + "=" + " " + product);


        }

    }
}
