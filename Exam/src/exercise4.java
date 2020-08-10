import java.util.Scanner;

public class exercise4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        String typeOfItem = scan.nextLine();
        int count = Integer.parseInt(scan.nextLine());
        double priceOfBalloonPerPiece = 0.0;
        double priceOfFlowersPerPiece = 0.0;
        double priceOfCandlesPerPiece = 0.0;
        double priceOfRibbonPerMeter = 0.0;

        double totalPriceOfBalloons = priceOfBalloonPerPiece * count;
        double totalPriceOfFlowers = priceOfFlowersPerPiece * count;
        double totalPriceOfCandles = priceOfCandlesPerPiece * count;
        double totalPriceOfRibbon = priceOfRibbonPerMeter * count;
        double totalPrice = totalPriceOfBalloons + totalPriceOfFlowers + totalPriceOfCandles + totalPriceOfRibbon;
        while(budget>0){
            typeOfItem=scan.nextLine();
            if ("balloons".equals(typeOfItem)) {
                priceOfBalloonPerPiece = 0.1;
            } else if ("flowers".equals(typeOfItem)) {
                priceOfFlowersPerPiece = 1.5;
            } else if ("candles".equals(typeOfItem)) {
                priceOfCandlesPerPiece = 0.5;
            } else if ("ribbon".equals(typeOfItem)) {
                priceOfRibbonPerMeter = 2.0;
            }

            break;
        }


    }

}
