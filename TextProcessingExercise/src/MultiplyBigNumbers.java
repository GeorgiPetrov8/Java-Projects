import java.util.Scanner;

public class MultiplyBigNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String bigNumber = scan.nextLine();
        int multiply = Integer.parseInt(scan.nextLine());
        if (multiply == 0) {
            System.out.println(0);
            return;
        }
        while (bigNumber.charAt(0) == '0') {
            bigNumber = bigNumber.substring(1);
        }

        StringBuilder result = new StringBuilder();

        int reminder = 0;

        for (int i = bigNumber.length() - 1; i >= 0  ; i--) {
            int num = Integer.parseInt(String.valueOf(bigNumber.charAt(i)));
            int currentDigit = num * multiply + reminder;
            result.append(currentDigit % 10);
                reminder = currentDigit / 10;

        }
        if (reminder != 0) {
            result.append(reminder);
        }


        System.out.println(result.reverse());





    }
}
