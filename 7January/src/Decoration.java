import java.util.Scanner;

public class Decoration {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        double spendMoney = 0;
        String input = scan.nextLine();
        int flowers= 0;
        int balloons= 0;
        int candles = 0;
        int ribbon = 0;
        boolean a = true;
        while(a){
            if(input.equals("stop")){
                System.out.printf("Spend money: %.2f\n" +
                        "Money left: %.2f\n" +
                        "Purchased decoration is %d balloons, %d m ribbon, %d flowers and %d candles.",spendMoney,budget,balloons,ribbon,flowers,candles);
                break;
            }
            String productType = input;
            int numberOfProduct = Integer.parseInt(scan.nextLine());
            double priceForOneProduct = 0;

            switch (productType) {
                case "flowers": {
                    priceForOneProduct = 1.5;
                    double price = priceForOneProduct * numberOfProduct;
                    budget -= price;
                    spendMoney += price;
                    flowers += numberOfProduct;

                    break;
                }
                case "balloons": {
                    priceForOneProduct = 0.1;
                    double price = priceForOneProduct * numberOfProduct;
                    budget -= price;
                    spendMoney += price;
                    balloons += numberOfProduct;

                    break;
                }
                case "candles": {
                    priceForOneProduct = 0.5;
                    double price = priceForOneProduct * numberOfProduct;
                    budget -= price;
                    spendMoney += price;
                    candles += numberOfProduct;

                    break;
                }
                case "ribbon": {
                    priceForOneProduct = 2;
                    double price = priceForOneProduct * numberOfProduct;
                    budget -= price;
                    spendMoney += price;
                    ribbon += numberOfProduct;
                    break;
                }
            }


            if(budget <= 0){
                System.out.printf("All money is spent!\n" +
                        "Purchased decoration is %d balloons, %d m ribbon, %d flowers and %d candles.",balloons,ribbon,flowers,candles);
                break;
            }
            input = scan.nextLine();
        }
        System.out.println();
    }
}
