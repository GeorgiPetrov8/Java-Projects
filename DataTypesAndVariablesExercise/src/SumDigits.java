import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());//123
        int sum = 0;
        while (n > 0){
            int lastDigit = n % 10; //3,2,1
            sum +=lastDigit;//3+2+1;
            n = n / 10;//12,1,0
        }
        System.out.println(sum);



    }
}