import java.nio.charset.IllegalCharsetNameException;
import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int sum=0;
        int counter=0;

        for (int i =0 ; i <100 ; i++) {
            if (i % 2 !=0) {
                System.out.println(i);
                sum+=i;
                counter++;
            }if (counter==n){
                break;
            }

        }
        System.out.printf("Sum: %s",sum);
    }
}
