import javafx.css.converter.LadderConverter;

        import java.math.BigDecimal;
        import java.util.Scanner;

public class ExactSumOfRealNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        BigDecimal result = BigDecimal.valueOf(0);



        for (int i = 0; i < n ; i++) {
            BigDecimal n1 = new BigDecimal(scan.nextLine());
            result = result.add(n1);
        }
        System.out.println(result);


    }
}
