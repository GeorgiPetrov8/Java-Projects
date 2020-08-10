import java.util.Scanner;

public class LowerOrUpper {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char ch = scan.nextLine().charAt(0);
        if (ch>=65 && ch<=90) {
            System.out.println("upper-case");

        }else if (ch>=97 && ch<=122) {
            System.out.println("lower-case");
        }


    }
}
