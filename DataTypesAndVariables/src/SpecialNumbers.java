import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= n ; i++) {//25
            int currentNum = i;//25
            int sum = 0;
            while (currentNum > 0) {//25 > 0; 2>0;
                sum+=currentNum % 10;//5=5+2=7;
                currentNum = currentNum / 10;//25 = 25 / 10= 2;
            }
            boolean isSpecial = sum ==5 || sum==7 || sum==11;
            if (isSpecial) {
                System.out.printf("\n%d -> True",i);
            }else {
                System.out.printf("\n%d -> False",i);
            }




        }

    }
}
