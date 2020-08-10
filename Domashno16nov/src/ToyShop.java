import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        double excursionPrice = Double.parseDouble(scan.nextLine());
        int puzzleCnt = Integer.parseInt(scan.nextLine());
        int dollCnt = Integer.parseInt(scan.nextLine());
        int bearCnt = Integer.parseInt(scan.nextLine());
        int minionCnt = Integer.parseInt(scan.nextLine());
        int carCnt = Integer.parseInt(scan.nextLine());


        double puzzlePrice = puzzleCnt * 2.60;
        double dollPrice =  dollCnt * 3;
        double bearPrice = bearCnt * 4.10;
        double minionPrice = minionCnt * 8.20;
        double carPrice = carCnt * 2;

        double TotalPrice = puzzlePrice + dollPrice + bearPrice + minionPrice + carPrice ;
        int TotalCnt = puzzleCnt + dollCnt + bearCnt + minionCnt + carCnt;

        if (TotalCnt >= 50) {
            TotalPrice = TotalPrice - (TotalPrice * 0.25);
        }
        TotalPrice = TotalPrice - (TotalPrice * 0.1);

        if (TotalPrice >= excursionPrice) {
            double MoneyLeft = TotalPrice - excursionPrice;
            System.out.printf("Yes! %.2f lv left.",MoneyLeft);
        } else {
            double MoneyNeed = excursionPrice - TotalPrice;
            System.out.printf("Not enough money! %.2f lv needed.", MoneyNeed);
        }


    }
}
