import javax.print.DocFlavor;
import java.io.InterruptedIOException;
import java.util.Scanner;

public class MultiplicateTable2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = Integer.parseInt(scan.nextLine());
        int start = Integer.parseInt(scan.nextLine());
//        int product = 0;
//        for (int i = start; i < 100; i++) {
//            product = input * i;
//            if (i > 10) {
//                break;
//            }
//            System.out.println(input + " " + "X" + " " + i + " " + "=" + " " + product);
//

        do {
            System.out.printf("%d X %d = %d%n",input,start, input * start);
            start++;
        }while (start <= 10);

        }


    }