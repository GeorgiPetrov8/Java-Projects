import com.sun.source.tree.IfTree;

import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String fruit = scan.nextLine();//(banana / apple / orange / grapefruit / kiwi /pineapple/ grapes
        String day = scan.nextLine();//(Monday / Tuesday / Wednesday / Thursday / Friday/saturday/sunday/
        double amount = Double.parseDouble(scan.nextLine());
        double price = 0;

        if (!fruit.equals("banana") || fruit.equals("apple") || fruit.equals("orange") || fruit.equals("grapefruit")
         || fruit.equals("kiwi") || fruit.equals("pineapple") || fruit.equals("grapes")) {
            System.out.println("error");
        }

        if (fruit.equals("banana")) {
            if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday")  ||
            day.equals("Friday")) {
                System.out.printf("%.2f",amount * 2.50);
            }else if (day.equals("Saturday") || day.equals("Sunday")) {
                System.out.printf("%.2f",amount * 2.70);
            }else {
                System.out.println("error");
            }
        }if (fruit.equals("apple")) {
            if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday")  ||
                    day.equals("Friday")) {
                System.out.printf("%.2f",amount * 1.20);

            }else if (day.equals("Saturday") || day.equals("Sunday")) {
                System.out.printf("%.2f",amount * 1.25);
            }else {
                System.out.println("error");
            }

        }if (fruit.equals("orange")) {
            if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday")  ||
                    day.equals("Friday")) {
                System.out.printf("%.2f",amount * 0.85);
            }else if (day.equals("Saturday") || day.equals("Sunday")) {
                System.out.printf("%.2f",amount * 0.90);
            }else {
                System.out.println("error");
            }
        }if (fruit.equals("grapefruit")) {
            if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday")  ||
                    day.equals("Friday")) {
                System.out.printf("%.2f",amount * 1.45);
            }else if (day.equals("Saturday") || day.equals("Sunday")) {
                System.out.printf("%.2f",amount * 1.60);
            }else {
                System.out.println("error");
            }
        }if (fruit.equals("kiwi")) {
            if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday")  ||
                    day.equals("Friday")) {
                System.out.printf("%.2f",amount * 2.70);
            }else if (day.equals("Saturday") || day.equals("Sunday")) {
                System.out.printf("%.2f",amount * 3.00);
            }else {
                System.out.println("error");
            }
        }if (fruit.equals("pineapple")) {
            if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday")  ||
                    day.equals("Friday")) {
                System.out.printf("%.2f",amount * 5.50);
            }else if (day.equals("Saturday") || day.equals("Sunday")) {
                System.out.printf("%.2f",amount * 5.60);
            }
        }if (fruit.equals("grapes")) {
            if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday")  ||
                    day.equals("Friday")) {
                System.out.printf("%.2f",amount * 3.85);
            }else if (day.equals("Saturday") || day.equals("Sunday")) {
                System.out.printf("%.2f",amount * 4.20);
            }else {
                System.out.println("error");
            }
        }
    }
}
