import java.util.Scanner;

public class FruitShop2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String fruit = scan.nextLine();
        String day = scan.nextLine();
        double amount = Double.parseDouble(scan.nextLine());

        boolean isError = true;
        double productPrice = 0;
        double totalSum = 0;
        if (day.equals("Monday") || day.equals("Tuesday") ||
                day.equals("Wednesday") || day.equals("Thursday") ||
                day.equals("Friday")) {
            switch (fruit) {
                case "banana" :
                    productPrice = 2.5;
                    break;
                case"apple" :
                    productPrice = 1.2;
                    break;
                case "orange" :
                    productPrice = 0.85;
                    break;
                case "grapefruit" :
                    productPrice = 1.45;
                    break;
                case "kiwi" :
                    productPrice = 2.7;
                    break;
                case "pineapple" :
                    productPrice = 5.5;
                    break;
                case "grapes" :
                    productPrice = 3.85;
                    break;
                default: isError = true;
                break;
            }
            totalSum = productPrice * amount;
            System.out.printf("%.2f", totalSum);
        }
        else if (day.equals("Saturday") || day.equals("Sunday")) {
            switch (fruit) {
                case "banana" :
                    productPrice = 2.7;
                    break;
                case "apple" :
                    productPrice = 1.25;
                    break;
                case "orange" :
                    productPrice = 0.9;
                    break;
                case "grapefruit" :
                    productPrice = 1.6;
                    break;
                case "kiwi" :
                    productPrice = 3;
                    break;
                case "pineapple" :
                    productPrice = 5.6;
                    break;
                case "grapes" :
                    productPrice = 4.2;
                    break;
                default: isError = true;
                break;
            }else if (){
                isError = true;
            }
            totalSum = productPrice * amount;

        }if (isError){
            System.out.println("error");
        }else {
            System.out.printf("%.2f", totalSum);

        }
    }
}
