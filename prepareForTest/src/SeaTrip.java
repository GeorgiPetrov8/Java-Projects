import java.util.Scanner;

public class SeaTrip {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int moneyForFood = Integer.parseInt(scan.nextLine());
        int moneyForItems = Integer.parseInt(scan.nextLine());
        int moneyForHotel = Integer.parseInt(scan.nextLine());

        double road = 420;
        double oil = road / 100 * 7;
        double moneyForOil = oil * 1.85;
        int moneyForTrip = 3 * moneyForFood + 3 * moneyForItems;
        double HotelDisCount = moneyForHotel * 0.9 + moneyForHotel * 0.85 + moneyForHotel * 0.8;
        double moneyNeeded = moneyForOil + moneyForTrip + HotelDisCount;
        System.out.printf("Money needed: %.2f", moneyNeeded);

    }
}
