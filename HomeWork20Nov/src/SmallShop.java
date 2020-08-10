import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String drink = scan.nextLine();
        String city = scan.nextLine();
        double number = Double.parseDouble(scan.nextLine());

        if (drink.equals("coffee")) {
            if (city.equals("Sofia")) {
                System.out.println(number * 0.50);
            }if (city.equals("Plovdiv")) {
                System.out.println(number * 0.40);
            }if (city.equals("Varna")) {
                System.out.println(number * 0.45);
            }
        } else if (drink.equals("water")) {
            if (city.equals("Sofia")) {
                System.out.println(number * 0.80);
            }if (city.equals("Plovdiv")) {
                System.out.printf("%.1f",number * 0.70);
            }if (city.equals("Varna")) {
                System.out.println(number * 0.70);
            }
        } else if (drink.equals("beer")) {
            if (city.equals("Sofia")) {
                System.out.printf("%.1f",number * 1.20);
            }if (city.equals("Plovdiv")) {
                System.out.println(number * 1.15);
            }if (city.equals("Varna")) {
                System.out.println(number * 1.10);
            }
        } else if (drink.equals("sweets")) {
            if (city.equals("Sofia")) {
                System.out.printf("%.4f",number * 1.45);
            }if (city.equals("Plovdiv")) {
                System.out.printf("%.4f",number * 1.30);
            }if (city.equals("Varna")) {
                System.out.printf("%.4f",number * 1.35);
            }
        } else if (drink.equals("peanuts")) {
            if (city.equals("Sofia")) {
                System.out.printf("%.1f",number * 1.60);
            }if (city.equals("Plovdiv")) {
                System.out.printf("%.1f",number * 1.50);
            }if (city.equals("Varna")) {
                System.out.printf("%.1f",number * 1.55);
            }
        }






            }

        }






