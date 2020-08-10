import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfPeople = Integer.parseInt(scan.nextLine());
        String typeOfTheGroup = scan.nextLine();
        String dayOfWeek = scan.nextLine();

        double price = 0.0;
        if (dayOfWeek.equals("Friday")) {
            if (typeOfTheGroup.equals("Students")) {
                price = 8.45;
            } else if (typeOfTheGroup.equals("Business")) {
                price = 10.90;
            } else if (typeOfTheGroup.equals("Regular")) {
                price = 15;
            }
        } else if (dayOfWeek.equals("Saturday")) {
            if (typeOfTheGroup.equals("Students")) {
                price = 9.80;
            } else if (typeOfTheGroup.equals("Business")) {
                price = 15.60;
            } else if (typeOfTheGroup.equals("Regular")) {
                price = 20;
            }

        } else if (dayOfWeek.equals("Sunday")) {
            if (typeOfTheGroup.equals("Students")) {
                price = 10.46;
            } else if (typeOfTheGroup.equals("Business")) {
                price = 16;
            } else if (typeOfTheGroup.equals("Regular")) {
                price = 22.50;
            }
        }if (typeOfTheGroup.equals("Students")) {
            if (numberOfPeople >= 30) {
                price -=price * 0.15;
            }
        }else if (typeOfTheGroup.equals("Business")) {
            if (numberOfPeople >= 100){
                numberOfPeople-=10;
            }
        }else if (typeOfTheGroup.equals("Regular")) {
            if (numberOfPeople>=10 && numberOfPeople<=20) {
                price-=price * 0.05;
            }
        }double totalPrice = price * numberOfPeople;
        System.out.printf("Total price: %.2f",totalPrice);
    }
}