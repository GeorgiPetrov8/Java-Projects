import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());

        if (num >= 1000) {
            num = 1000 / 2 ;
            System.out.println(num);
        }
    }
}
